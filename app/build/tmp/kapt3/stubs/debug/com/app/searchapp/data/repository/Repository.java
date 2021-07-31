package com.app.searchapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/app/searchapp/data/repository/Repository;", "", "()V", "Companion", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    public static final com.app.searchapp.data.repository.Repository.Companion Companion = null;
    private static final com.app.searchapp.data.service.ApiInterface apiService = null;
    
    public Repository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/app/searchapp/data/repository/Repository$Companion;", "", "()V", "apiService", "Lcom/app/searchapp/data/service/ApiInterface;", "getImages", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lcom/app/searchapp/model/PixabayImageList;", "page", "", "keyword", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.reactivex.Observable<retrofit2.Response<com.app.searchapp.model.PixabayImageList>> getImages(int page, @org.jetbrains.annotations.NotNull()
        java.lang.String keyword) {
            return null;
        }
    }
}