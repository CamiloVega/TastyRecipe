package com.cvdevelopers.scafold2.dagger.module

import android.app.Application
import com.cvdevelopers.scafold2.cache.TastyDatabase
import com.cvdevelopers.scafold2.cache.dao.RecipeDao
import dagger.Module
import dagger.Provides
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun providesDatabase(application: DaggerApplication) = TastyDatabase.getDatabase(application)

    @Provides
    @Singleton
    fun providesSchoolCacheDao(database: TastyDatabase): RecipeDao = database.recipeDao()

}