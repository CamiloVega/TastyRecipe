package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Component(
    @SerializedName("extra_comment")
    val extraComment: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("ingredient")
    val ingredient: Ingredient = Ingredient(),
    @SerializedName("measurements")
    val measurements: List<Measurement> = listOf(),
    @SerializedName("position")
    val position: Int = 0,
    @SerializedName("raw_text")
    val rawText: String = ""
)