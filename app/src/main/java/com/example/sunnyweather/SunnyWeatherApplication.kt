package com.example.sunnyweather

import android.app.Application
import android.content.Context


class SunnyWeatherApplication : Application() {

    companion object {
        const val TOKEN = "nJnsvK5DxlQdDxUH"
        lateinit var context : Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}