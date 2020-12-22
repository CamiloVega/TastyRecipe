package com.cvdevelopers.scafold2.dagger.module

import com.cvdevelopers.scafold2.ui.list.RecipeListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BindingModule {

    @ContributesAndroidInjector(modules = [MainFragmentDaggerModule::class])
    abstract fun providesMainFragment(): RecipeListFragment

}