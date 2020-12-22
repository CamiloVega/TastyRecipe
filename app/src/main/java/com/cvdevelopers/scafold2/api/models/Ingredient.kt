package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Ingredient(
    @SerializedName("created_at")
    val createdAt: Int = 0,
    @SerializedName("display_plural")
    val displayPlural: String = "",
    @SerializedName("display_singular")
    val displaySingular: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("updated_at")
    val updatedAt: Int = 0
)