package com.pokeweather.android.logic.network

import com.pokeweather.android.PokeWeatherApplication
import com.pokeweather.android.logic.model.DailyResponse
import com.pokeweather.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.5/${PokeWeatherApplication.Token}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    @GET("v2.5/${PokeWeatherApplication.Token}/{lng},{lat}/daily.json")
    fun getDialyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}