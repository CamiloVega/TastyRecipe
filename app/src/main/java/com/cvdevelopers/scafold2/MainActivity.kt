package com.cvdevelopers.scafold2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cvdevelopers.scafold2.ui.list.RecipeListFragment

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity)
    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
          .replace(R.id.container, RecipeListFragment.newInstance())
          .commitNow()
    }
  }
}