package com.cvdevelopers.scafold2.api.models


import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class Compilation(
    @SerializedName("approved_at")
    val approvedAt: Int = 0,
    @SerializedName("aspect_ratio")
    val aspectRatio: String = "",
    @SerializedName("beauty_url")
    val beautyUrl: Any? = Any(),
    @SerializedName("buzz_id")
    val buzzId: Any? = Any(),
    @SerializedName("canonical_id")
    val canonicalId: String = "",
    @SerializedName("country")
    val country: String = "",
    @SerializedName("created_at")
    val createdAt: Int = 0,
    @SerializedName("description")
    val description: String = "",
    @SerializedName("draft_status")
    val draftStatus: String = "",
    @SerializedName("facebook_posts")
    val facebookPosts: List<Any> = listOf(),
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("is_shoppable")
    val isShoppable: Boolean = false,
    @SerializedName("keywords")
    val keywords: Any? = Any(),
    @SerializedName("language")
    val language: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("promotion")
    val promotion: String = "",
    @Embedded
    @SerializedName("show")
    val show: List<Show> = listOf(),
    @SerializedName("slug")
    val slug: String = "",
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String = "",
    @SerializedName("video_id")
    val videoId: Int = 0,
    @SerializedName("video_url")
    val videoUrl: String = ""
)