package com.cvdevelopers.scafold2.dagger.module

import androidx.lifecycle.ViewModel
import com.cvdevelopers.scafold2.dagger.viewmodel.ViewModelKey
import com.cvdevelopers.scafold2.ui.list.RecipeListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainFragmentDaggerModule {

    @Binds
    @IntoMap
    @ViewModelKey(RecipeListViewModel::class)
    abstract fun providesMainViewModel(recipeListViewModel: RecipeListViewModel): ViewModel
}