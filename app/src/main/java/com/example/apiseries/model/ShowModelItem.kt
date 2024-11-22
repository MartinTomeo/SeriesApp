package com.example.apiseries.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class ShowModelItem(
    val score: String?,
    val show: Show?
) : Parcelable