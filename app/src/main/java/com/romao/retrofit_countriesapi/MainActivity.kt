package com.romao.retrofit_countriesapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.romao.retrofit_countriesapi.network.getApi
import com.romao.retrofit_countriesapi.network.responses.Country
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getApi()?.getAllCountries()?.enqueue(object: Callback<List<Country>> {
            override fun onFailure(call: Call<List<Country>>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<List<Country>>, response: Response<List<Country>>) {
                response.body()?.forEach { country -> Log.i("Country name", country.countryName)
                }
            }

        } )

    }
}