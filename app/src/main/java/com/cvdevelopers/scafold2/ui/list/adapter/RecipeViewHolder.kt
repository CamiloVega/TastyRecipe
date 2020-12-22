package com.cvdevelopers.scafold2.ui.list.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.cvdevelopers.scafold2.R
import com.cvdevelopers.scafold2.databinding.RecipeItemBinding
import com.cvdevelopers.scafold2.utils.loadImage

class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private var binding: RecipeItemBinding? = null

    init {
        binding = RecipeItemBinding.bind(view)
    }

    fun bindViewHolder(recipeItem: RecipeItem){
        binding?.recipeName?.text = recipeItem.name
        binding?.recipeImage?.loadImage(recipeItem.imageUrl, R.drawable.food_placeholder)
    }

}