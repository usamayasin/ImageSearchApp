package com.app.searchapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class PixabayImage(
    val id: String,
    val previewHeight: Int,
    val likes: Int,
    val tags: String,
    val webformatHeight: Int,
    val views: Long,
    val webformatWidth: Int,
    val previewWidth: Int,
    val comments: Int,
    val downloads: Int,
    val pageURL: String,
    val previewURL: String,
    val largeImageURL: String,
    val webformatURL: String,
    val imageWidth: Int,
    val userId: Int,
    val user: String,
    val type: String,
    val user_id: Int,
    val userImageURL: String,
    val imageHeight: Int
) : Parcelable
