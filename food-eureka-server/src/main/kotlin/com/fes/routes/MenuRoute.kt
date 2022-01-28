package com.fes.routes

import com.fes.data.model.Menu
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://localhost:8000"
private val menus = listOf(
    Menu("Burger","1","500 Ksh","$BASE_URL/food/burger.jpg"),
    Menu("Chips Masala","1 plate","300","$BASE_URL/food/chipsmasala.jpg"),
    Menu("500ml Coke","1","100","$BASE_URL/food/coke500ml.jp"),
    Menu("350ml Coke Can","1","100","$BASE_URL/food/CokeCan.jpeg"),
    Menu("Crispy Chicken","1 piece","250","$BASE_URL/food/crispychicken.jpeg"),
    Menu("Fries","1 plate","150","$BASE_URL/food/fries.gif"),
    Menu("Nyama Choma","1/4 kg","250","$BASE_URL/food/nyamachoma.jpeg"),
    Menu("Peruvian Chicken","1/4 kg","300","$BASE_URL/food/PeruvianChicken.jpg"),
    Menu("Pizza","small","600","$BASE_URL/menu/pizza.jpeg"),
)

fun Route.randomMenu(){
    get("/menu"){
        call.respond(
            HttpStatusCode.OK,
            menus.random()
        )
    }
}