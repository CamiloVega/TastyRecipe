package com.cvdevelopers.scafold2.utils

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(imageUrl: String, placeholder: Int) = Glide.with(this.context)
    .load(imageUrl)
    .placeholder(placeholder)
    .into(this)