package com.fes.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Menu(
    val name: String,
    val quantity: String,
    val price: String,
    val imageUrl: String
)
