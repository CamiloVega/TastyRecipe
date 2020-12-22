package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class RecircFeeds(
    @SerializedName("ease")
    val ease: List<String> = listOf(),
    @SerializedName("meal")
    val meal: List<String> = listOf()
)