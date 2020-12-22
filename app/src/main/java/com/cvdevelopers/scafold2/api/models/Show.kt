package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Show(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = ""
)