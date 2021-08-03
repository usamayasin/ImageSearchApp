package com.app.searchapp.data.repository

import com.app.searchapp.data.network.ApiService
import com.app.searchapp.model.PixabayImageList
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class Repository @Inject constructor( private val retrofit: Retrofit ) {

    private var apiService: ApiService = retrofit.create(ApiService::class.java)

    fun getImages(page: Int, keyword: String): Observable<Response<PixabayImageList>> {
        return apiService.getImages(page, keyword)
    }
}