package com.romao.retrofit_countriesapi.network

import com.romao.retrofit_countriesapi.network.responses.Country
import retrofit2.Call
import retrofit2.http.GET

interface DataService {
    @GET("all")
    fun getAllCountries():Call<List<Country>>
}