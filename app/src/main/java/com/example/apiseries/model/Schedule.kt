package com.example.apiseries.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Schedule(
    val days: List<String?>,
    val time: String?
) : Parcelable