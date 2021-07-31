package com.app.searchapp.adapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, imageUrl: String?) {

    if (imageUrl == null) {
        view.setImageDrawable(null)
    } else {
        Glide.with(view.context)
            .load(imageUrl)
            .into(view)
    }
}
