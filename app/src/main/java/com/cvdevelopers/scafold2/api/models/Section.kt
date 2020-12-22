package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Section(
    @SerializedName("components")
    val components: List<Component> = listOf(),
    @SerializedName("name")
    val name: Any? = Any(),
    @SerializedName("position")
    val position: Int = 0
)