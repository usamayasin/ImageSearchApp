package com.app.searchapp.data.service

import android.webkit.URLUtil
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiClient  {

    companion object {

        private var baseUrl = "https://pixabay.com/api/"
        private var retrofit: Retrofit? = null
        private var service: ApiService? = null
        @Volatile private var INSTANCE: ApiService? = null



        private fun buildApiInstance(): ApiService? {
            try {
                val interceptor : HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
                    this.level = HttpLoggingInterceptor.Level.BODY
                }

                val okHttpClient = OkHttpClient.Builder()
                    .readTimeout(120, TimeUnit.SECONDS)
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .addInterceptor(interceptor)
                    .build()

                if (URLUtil.isValidUrl(baseUrl)) {
                    retrofit = Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okHttpClient)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .build()
                    service = retrofit?.create(
                        ApiService::class.java
                    )
                } else {
                    return service
                }
            } catch (e: Exception) {
            }
            return service
        }
    }

    fun getInstance(): ApiService? =
        INSTANCE ?: synchronized(this) {
            INSTANCE ?: buildApiInstance().also { INSTANCE = it }
        }
}