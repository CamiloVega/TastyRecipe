package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Measurement(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("quantity")
    val quantity: String = "",
    @SerializedName("unit")
    val unit: Unit = Unit()
)