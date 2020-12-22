package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Nutrition(
    @SerializedName("calories")
    val calories: Int = 0,
    @SerializedName("carbohydrates")
    val carbohydrates: Int = 0,
    @SerializedName("fat")
    val fat: Int = 0,
    @SerializedName("fiber")
    val fiber: Int = 0,
    @SerializedName("protein")
    val protein: Int = 0,
    @SerializedName("sugar")
    val sugar: Int = 0,
    @SerializedName("updated_at")
    val updatedAt: String = ""
)