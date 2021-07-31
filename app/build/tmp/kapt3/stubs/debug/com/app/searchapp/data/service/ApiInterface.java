package com.app.searchapp.data.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/app/searchapp/data/service/ApiInterface;", "", "getImages", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lcom/app/searchapp/model/PixabayImageList;", "page", "", "keyword", "", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "?key=22656441-f7598bc34d9ae4af668fae94a&image_type=photo")
    public abstract io.reactivex.Observable<retrofit2.Response<com.app.searchapp.model.PixabayImageList>> getImages(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String keyword);
}