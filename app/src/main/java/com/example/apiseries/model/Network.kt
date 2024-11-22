package com.example.apiseries.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Network(
    val country: Country?,
    val id: String?,
    val name: String?,
    val officialSite: String?
) : Parcelable