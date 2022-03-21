package com.kotlin.recyclerviewcoroutines.RetrofitEssentials

import com.kotlin.recyclerviewcoroutines.Models.QuotesModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("quotes?page=1")
    suspend fun getQuotes(): Response<QuotesModel>

}