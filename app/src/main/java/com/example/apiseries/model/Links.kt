package com.example.apiseries.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Links(
    val previousepisode: Previousepisode?,
    val self: Self?
) : Parcelable