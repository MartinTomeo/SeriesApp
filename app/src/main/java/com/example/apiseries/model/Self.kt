package com.example.apiseries.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Self(
    val href: String?
) : Parcelable