package com.app.searchapp.data.service

import com.app.searchapp.model.PixabayImageList
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("?key=22656441-f7598bc34d9ae4af668fae94a&image_type=photo")
    fun getImages(
        @Query("page") page: Int,
        @Query("q") keyword: String
    ): Observable<Response<PixabayImageList>>


}