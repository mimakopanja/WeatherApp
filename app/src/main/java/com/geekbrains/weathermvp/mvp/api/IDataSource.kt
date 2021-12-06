package com.geekbrains.weathermvp.mvp.api

import com.geekbrains.weathermvp.mvp.entity.Weather
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface IDataSource {

    @GET("v2/informers")
    fun getWeather(
        @Header("X-Yandex-API-Key") api_key: String,
        @Query("lat") lat: Double,
        @Query("lon") lon: Double
    ): Single<Weather>
}