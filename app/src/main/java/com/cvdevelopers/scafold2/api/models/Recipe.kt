package com.cvdevelopers.scafold2.api.models


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Recipe(
    @SerializedName("approved_at")
    val approvedAt: Int = 0,
    @SerializedName("aspect_ratio")
    val aspectRatio: String = "",
    @SerializedName("beauty_url")
    val beautyUrl: String? = null,
    @SerializedName("canonical_id")
    val canonicalId: String = "",
//    @Embedded
//    @SerializedName("compilations")
//    val compilations: List<Compilation> = listOf(),
    @SerializedName("cook_time_minutes")
    val cookTimeMinutes: Int = 0,
    @SerializedName("country")
    val country: String = "",
    @SerializedName("created_at")
    val createdAt: Int = 0,
//    @Embedded
//    @SerializedName("credits")
//    val credits: List<Credit> = listOf(),
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("draft_status")
    val draftStatus: String? = null,
    @PrimaryKey
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("inspired_by_url")
    val inspiredByUrl: String? = null,
//    @Embedded
//    @SerializedName("instructions")
//    val instructions: List<Instruction> = listOf(),
    @SerializedName("is_one_top")
    val isOneTop: Boolean = false,
    @SerializedName("is_shoppable")
    val isShoppable: Boolean = false,
    @SerializedName("keywords")
    val keywords: String? = null,
    @SerializedName("language")
    val language: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("num_servings")
    val numServings: Int = 0,
//    @Embedded
//    @SerializedName("nutrition")
//    val nutrition: Nutrition = Nutrition(),
    @SerializedName("nutrition_visibility")
    val nutritionVisibility: String? = null,
    @SerializedName("original_video_url")
    val originalVideoUrl: String? = null,
    @SerializedName("prep_time_minutes")
    val prepTimeMinutes: Int = 0,
    @SerializedName("promotion")
    val promotion: String? = null,
//    @Embedded
//    @SerializedName("sections")
//    val sections: List<Section> = listOf(),
    @SerializedName("seo_title")
    val seoTitle: String? = null,
    @SerializedName("servings_noun_plural")
    val servingsNounPlural: String? = null,
    @SerializedName("servings_noun_singular")
    val servingsNounSingular: String? = null,
//    @Embedded
//    @SerializedName("show")
//    val show: Show = Show(),
    @SerializedName("show_id")
    val showId: Int = 0,
    @SerializedName("slug")
    val slug: String? = null,
//    @Embedded
//    @SerializedName("tags")
//    val tags: List<Tag> = listOf(),
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String = "",
    @SerializedName("tips_and_ratings_enabled")
    val tipsAndRatingsEnabled: Boolean = false,
    @SerializedName("total_time_minutes")
    val totalTimeMinutes: Int = 0,
//    @Embedded
//    @SerializedName("total_time_tier")
//    val totalTimeTier: TotalTimeTier = TotalTimeTier(),
    @SerializedName("updated_at")
    val updatedAt: Int = 0,
//    @Embedded
//    @SerializedName("user_ratings")
//    val userRatings: UserRatings = UserRatings(),
    @SerializedName("video_ad_content")
    val videoAdContent: String? = null,
    @SerializedName("video_id")
    val videoId: Int = 0,
    @SerializedName("video_url")
    val videoUrl: String? = null,
    @SerializedName("yields")
    val yields: String? = null
)