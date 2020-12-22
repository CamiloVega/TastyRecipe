package com.cvdevelopers.scafold2.cache

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cvdevelopers.scafold2.api.models.Recipe
import com.cvdevelopers.scafold2.cache.dao.RecipeDao

@Database(entities = [Recipe::class], version = 1)
abstract class TastyDatabase: RoomDatabase() {

  abstract fun recipeDao(): RecipeDao

  companion object {
    @Volatile
    private var INSTANCE: TastyDatabase? = null

    fun getDatabase(context: Context): TastyDatabase {
      val tempInstance = INSTANCE
      if (tempInstance != null) {
        return tempInstance
      }
      synchronized(this) {
        val instance = Room.databaseBuilder(
            context.applicationContext,
            TastyDatabase::class.java,
            "room_database"
        ).build()
        INSTANCE = instance
        return instance
      }
    }
  }
}