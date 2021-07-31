package com.app.searchapp.ui.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.searchapp.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun toPhotoDetailFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.toPhotoDetailFragment)
  }
}
