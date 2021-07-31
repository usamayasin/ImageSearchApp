package com.app.searchapp.data.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/app/searchapp/data/service/ApiClient;", "", "()V", "Companion", "app_debug"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull()
    public static final com.app.searchapp.data.service.ApiClient.Companion Companion = null;
    private static java.lang.String baseUrl = "https://pixabay.com/api/";
    private static retrofit2.Retrofit retrofit;
    private static com.app.searchapp.data.service.ApiInterface service;
    private static volatile com.app.searchapp.data.service.ApiInterface INSTANCE;
    
    public ApiClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/app/searchapp/data/service/ApiClient$Companion;", "", "()V", "INSTANCE", "Lcom/app/searchapp/data/service/ApiInterface;", "baseUrl", "", "retrofit", "Lretrofit2/Retrofit;", "service", "buildApiInstance", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.searchapp.data.service.ApiInterface getInstance() {
            return null;
        }
        
        private final com.app.searchapp.data.service.ApiInterface buildApiInstance() {
            return null;
        }
    }
}