package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("display_name")
    val displayName: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("type")
    val type: String = ""
)