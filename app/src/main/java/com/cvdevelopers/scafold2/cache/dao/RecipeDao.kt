package com.cvdevelopers.scafold2.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cvdevelopers.scafold2.api.models.Recipe
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

@Dao
interface RecipeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipes(recipeList: List<Recipe>): Completable

    @Query("Select * from Recipe")
    fun queryAllRecipes(): Observable<List<Recipe>>

    @Query("DELETE FROM Recipe")
    fun clearScoresCache(): Completable
}