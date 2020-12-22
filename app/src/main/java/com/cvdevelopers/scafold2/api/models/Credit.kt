package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Credit(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("type")
    val type: String = ""
)