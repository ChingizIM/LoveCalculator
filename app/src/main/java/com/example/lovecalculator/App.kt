package com.example.lovecalculator

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.lovecalculator.network.LoveApi
import com.example.lovecalculator.network.RetrofitService
import retrofit2.Retrofit

class App : Application() {
    companion object{
        lateinit var api: LoveApi

    }

    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        api=retrofitService.api



    }

}

