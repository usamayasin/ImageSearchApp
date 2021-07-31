package com.app.searchapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/app/searchapp/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "imageLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/app/searchapp/model/PixabayImage;", "getImageLiveData", "()Landroidx/lifecycle/LiveData;", "imagesMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "fetchImages", "", "page", "", "keyword", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.app.searchapp.model.PixabayImage>> imagesMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.app.searchapp.model.PixabayImage>> imageLiveData = null;
    
    public HomeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.app.searchapp.model.PixabayImage>> getImageLiveData() {
        return null;
    }
    
    public final void fetchImages(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String keyword) {
    }
}