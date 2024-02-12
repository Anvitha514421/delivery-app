package com.example.deliveryapp.domain.model

data class MenuItem(
    val dish: String,
    val price: Double,
    val rating: Double,
    val noOfRatings: Int,
    val isVegetarian: Boolean
)
