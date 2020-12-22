package com.cvdevelopers.scafold2.api.models


import com.google.gson.annotations.SerializedName

data class Rendition(
    @SerializedName("aspect")
    val aspect: String = "",
    @SerializedName("bit_rate")
    val bitRate: Int? = 0,
    @SerializedName("container")
    val container: String = "",
    @SerializedName("content_type")
    val contentType: String = "",
    @SerializedName("duration")
    val duration: Int = 0,
    @SerializedName("file_size")
    val fileSize: Int? = 0,
    @SerializedName("height")
    val height: Int = 0,
    @SerializedName("maximum_bit_rate")
    val maximumBitRate: Any? = Any(),
    @SerializedName("minimum_bit_rate")
    val minimumBitRate: Any? = Any(),
    @SerializedName("name")
    val name: String = "",
    @SerializedName("poster_url")
    val posterUrl: String = "",
    @SerializedName("url")
    val url: String = "",
    @SerializedName("width")
    val width: Int = 0
)