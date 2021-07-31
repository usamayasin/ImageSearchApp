package com.app.searchapp.ui.home

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class HomeFragmentArgs(
  public val image: String = "",
  public val username: String = "",
  public val tags: String = "",
  public val likes: String = "",
  public val comments: String = "",
  public val downloads: String = ""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("image", this.image)
    result.putString("username", this.username)
    result.putString("tags", this.tags)
    result.putString("likes", this.likes)
    result.putString("comments", this.comments)
    result.putString("downloads", this.downloads)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): HomeFragmentArgs {
      bundle.setClassLoader(HomeFragmentArgs::class.java.classLoader)
      val __image : String?
      if (bundle.containsKey("image")) {
        __image = bundle.getString("image")
        if (__image == null) {
          throw IllegalArgumentException("Argument \"image\" is marked as non-null but was passed a null value.")
        }
      } else {
        __image = ""
      }
      val __username : String?
      if (bundle.containsKey("username")) {
        __username = bundle.getString("username")
        if (__username == null) {
          throw IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.")
        }
      } else {
        __username = ""
      }
      val __tags : String?
      if (bundle.containsKey("tags")) {
        __tags = bundle.getString("tags")
        if (__tags == null) {
          throw IllegalArgumentException("Argument \"tags\" is marked as non-null but was passed a null value.")
        }
      } else {
        __tags = ""
      }
      val __likes : String?
      if (bundle.containsKey("likes")) {
        __likes = bundle.getString("likes")
        if (__likes == null) {
          throw IllegalArgumentException("Argument \"likes\" is marked as non-null but was passed a null value.")
        }
      } else {
        __likes = ""
      }
      val __comments : String?
      if (bundle.containsKey("comments")) {
        __comments = bundle.getString("comments")
        if (__comments == null) {
          throw IllegalArgumentException("Argument \"comments\" is marked as non-null but was passed a null value.")
        }
      } else {
        __comments = ""
      }
      val __downloads : String?
      if (bundle.containsKey("downloads")) {
        __downloads = bundle.getString("downloads")
        if (__downloads == null) {
          throw IllegalArgumentException("Argument \"downloads\" is marked as non-null but was passed a null value.")
        }
      } else {
        __downloads = ""
      }
      return HomeFragmentArgs(__image, __username, __tags, __likes, __comments, __downloads)
    }
  }
}
