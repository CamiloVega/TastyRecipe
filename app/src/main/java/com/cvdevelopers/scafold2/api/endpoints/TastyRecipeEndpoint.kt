package com.cvdevelopers.scafold2.api.endpoints

import com.cvdevelopers.scafold2.api.models.RecipeResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface TastyRecipeEndpoint {

    @GET("/recipes/list")
    fun getRecipies(@Query("from") from: Int = 0, @Query("size") size: Int = 25, @Query("tags") tags: String? = null): Single<RecipeResponse>

}