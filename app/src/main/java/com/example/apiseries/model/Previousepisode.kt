package com.example.apiseries.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Previousepisode(
    val href: String?,
    val name: String?
) : Parcelable