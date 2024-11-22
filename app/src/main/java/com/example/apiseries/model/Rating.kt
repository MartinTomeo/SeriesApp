package com.example.apiseries.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Rating(
    val average: String?
) : Parcelable