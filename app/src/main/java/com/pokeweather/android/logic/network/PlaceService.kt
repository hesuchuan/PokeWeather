package com.pokeweather.android.logic.network

import com.pokeweather.android.PokeWeatherApplication
import com.pokeweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${PokeWeatherApplication.Token}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String) : Call<PlaceResponse>
}