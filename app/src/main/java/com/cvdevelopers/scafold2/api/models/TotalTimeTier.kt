package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class TotalTimeTier(
    @SerializedName("display_tier")
    val displayTier: String = "",
    @SerializedName("tier")
    val tier: String = ""
)