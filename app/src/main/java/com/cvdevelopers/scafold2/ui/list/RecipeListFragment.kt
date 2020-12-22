package com.cvdevelopers.scafold2.ui.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cvdevelopers.scafold2.R
import com.cvdevelopers.scafold2.dagger.viewmodel.ViewModelFactory
import com.cvdevelopers.scafold2.databinding.RecipeListFragmentBinding
import com.cvdevelopers.scafold2.ui.list.adapter.RecipeListAdapter
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class RecipeListFragment : DaggerFragment() {

  companion object {
    fun newInstance() = RecipeListFragment()
  }

  @Inject
  lateinit var viewModelFactory: ViewModelFactory

  private lateinit var viewModel: RecipeListViewModel

  private var fragmentBinding: RecipeListFragmentBinding? = null

  private var adapter = RecipeListAdapter()

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View {
    return inflater.inflate(R.layout.recipe_list_fragment, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    fragmentBinding = RecipeListFragmentBinding.bind(view)
    fragmentBinding?.recipeRecyclerView?.adapter = adapter
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProvider(this, viewModelFactory).get(RecipeListViewModel::class.java)
    viewModel.observeLiveData().observe(viewLifecycleOwner, {
      adapter.submitList(it)
    })
    // TODO: Use the ViewModel
  }

}