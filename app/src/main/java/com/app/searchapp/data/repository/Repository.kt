package com.app.searchapp.data.repository

import com.app.searchapp.MyApplication
import com.app.searchapp.data.service.ApiService
import com.app.searchapp.di.AppComponent
import com.app.searchapp.model.PixabayImageList
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class Repository {

    var appComponent: AppComponent
    @Inject
    lateinit var retrofit: Retrofit

    init {
        appComponent =  MyApplication.appComponent
        appComponent.inject(this)
    }

    private var apiService: ApiService = retrofit.create(ApiService::class.java)

    fun getImages(page: Int, keyword: String): Observable<Response<PixabayImageList>> {
        return apiService.getImages(page, keyword)
    }

}