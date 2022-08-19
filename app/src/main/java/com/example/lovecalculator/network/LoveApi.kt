package com.example.lovecalculator.network

import com.example.lovecalculator.LoveModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage")
    fun calculate(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key: String = "6e5859990amshb7700c13fb9143bp14988cjsn0db99ec4bf4a",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"
    ):Call<LoveModel>

}