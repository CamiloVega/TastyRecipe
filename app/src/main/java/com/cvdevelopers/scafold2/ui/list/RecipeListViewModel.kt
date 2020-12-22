package com.cvdevelopers.scafold2.ui.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cvdevelopers.scafold2.api.endpoints.TastyRecipeEndpoint
import com.cvdevelopers.scafold2.api.models.Recipe
import com.cvdevelopers.scafold2.cache.dao.RecipeDao
import com.cvdevelopers.scafold2.ui.list.adapter.RecipeItem
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class RecipeListViewModel @Inject constructor(tastyRecipeEndpoint: TastyRecipeEndpoint, private val tastyDao: RecipeDao) : ViewModel() {

    private val listLiveData = MutableLiveData<List<RecipeItem>>()

     fun observeLiveData() = listLiveData as LiveData<List<RecipeItem>>

    private val disposable = CompositeDisposable()

    init {

        tastyRecipeEndpoint.getRecipies(size = 100)
            .subscribeOn(Schedulers.io())
            .flatMapCompletable { tastyDao.insertRecipes(it.results) }
            .subscribe({
                Log.d("TASTY_DEBUG", "Fetch completed")
            }, {
                Log.e("TASTY_DEBUG", "error", it)
            }).addTo(disposable)

        tastyDao.queryAllRecipes()
            .subscribeOn(Schedulers.io())
            .map { it.toRecipeItemList() }
            .subscribe({
                       listLiveData.postValue(it)
            },{

            }).addTo(disposable)
    }

    private fun List<Recipe>.toRecipeItemList(): List<RecipeItem> =
        this.map {
            it.toRecipeItem()
        }

    private fun Recipe.toRecipeItem() = RecipeItem(
        name = name,
        imageUrl = thumbnailUrl
    )

    override fun onCleared() {
        disposable.clear()
        super.onCleared()
    }
}