package com.app.searchapp.data.repository

import com.app.searchapp.data.service.ApiClient
import com.app.searchapp.model.PixabayImageList
import io.reactivex.Observable
import retrofit2.Response

class Repository {


    companion object{
        private val apiService =  ApiClient.getInstance();

        fun getImages(page: Int, keyword: String): Observable<Response<PixabayImageList>> {
           return apiService!!.getImages(page, keyword)
        }

    }


}