package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class UserRatings(
    @SerializedName("count_negative")
    val countNegative: Int = 0,
    @SerializedName("count_positive")
    val countPositive: Int = 0,
    @SerializedName("score")
    val score: Int = 0
)