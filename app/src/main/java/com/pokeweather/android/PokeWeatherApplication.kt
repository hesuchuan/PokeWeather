package com.pokeweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class PokeWeatherApplication: Application() {
    companion object{

        const val Token = "DrbBmrpPsJaQIOSs"  //令牌值

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}