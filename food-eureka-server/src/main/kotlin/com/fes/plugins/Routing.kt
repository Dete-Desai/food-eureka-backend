package com.fes.plugins

import com.fes.routes.randomMenu
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.locations.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    install(Locations) {
    }

    routing {
        randomMenu()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
@Location("/location/{name}")
class MyLocation(val name: String, val arg1: Int = 42, val arg2: String = "default")
@Location("/type/{name}") data class Type(val name: String) {
    @Location("/edit")
    data class Edit(val type: Type)

    @Location("/list/{page}")
    data class List(val type: Type, val page: Int)
}
