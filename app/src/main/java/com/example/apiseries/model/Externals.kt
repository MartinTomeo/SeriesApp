package com.example.apiseries.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Externals(
    val imdb: String?,
    val thetvdb: String?,
    val tvrage: String?
) : Parcelable