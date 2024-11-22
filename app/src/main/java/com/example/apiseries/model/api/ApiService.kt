package com.example.apiseries.model.api

import com.example.apiseries.model.ShowModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("search/shows")
    suspend fun getShows(
        @Query("q") query: String,
    ): Response<ShowModel>
}