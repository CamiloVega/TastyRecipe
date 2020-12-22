package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Instruction(
    @SerializedName("display_text")
    val displayText: String = "",
    @SerializedName("end_time")
    val endTime: Int = 0,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("position")
    val position: Int = 0,
    @SerializedName("start_time")
    val startTime: Int = 0,
)