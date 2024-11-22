package com.example.apiseries.model

import android.os.Parcelable
import com.example.apiseries.model.Externals
import com.example.apiseries.model.Image
import com.example.apiseries.model.Links
import com.example.apiseries.model.Network
import com.example.apiseries.model.Rating
import com.example.apiseries.model.Schedule
import com.example.apiseries.model.WebChannel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Show(
    val _links: Links?,
    val averageRuntime: String?,
    val dvdCountry: String?,
    val ended: String?,
    val externals: Externals?,
    val genres: List<String?>,
    val id: String?,
    val image: Image?,
    val language: String?,
    val name: String?,
    val network: Network?,
    val officialSite: String?,
    val premiered: String?,
    val rating: Rating?,
    val runtime: String?,
    val schedule: Schedule?,
    val status: String?,
    val summary: String?,
    val type: String?,
    val updated: String?,
    val url: String?,
    val webChannel: WebChannel?,
    val weight: String?
) : Parcelable