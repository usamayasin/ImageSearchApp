package com.app.searchapp.model

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class PixabayImageList(
    val total: Int,
    val totalHits: Int,
    var hits: List<PixabayImage>
) : Parcelable
