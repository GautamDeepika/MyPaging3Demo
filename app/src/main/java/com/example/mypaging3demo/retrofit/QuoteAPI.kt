package com.example.mypaging3demo.retrofit

import com.example.mypaging3demo.models.QuoteList
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteAPI {

    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page: Int): QuoteList

}