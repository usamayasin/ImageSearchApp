package com.app.searchapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\u0014H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/app/searchapp/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/app/searchapp/adapters/ImageAdapter$ImageClickListener;", "()V", "imageAdapter", "Lcom/app/searchapp/adapters/ImageAdapter;", "imagesList", "Ljava/util/ArrayList;", "Lcom/app/searchapp/model/PixabayImage;", "isPagination", "", "mBinding", "Lcom/app/searchapp/databinding/HomeFragmentBinding;", "mKeyWords", "", "scrollListener", "Lcom/app/searchapp/utils/EndlessScrollListener;", "viewModel", "Lcom/app/searchapp/ui/home/HomeViewModel;", "init", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onImageClicked", "image", "setUpObserver", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.app.searchapp.adapters.ImageAdapter.ImageClickListener {
    private com.app.searchapp.databinding.HomeFragmentBinding mBinding;
    private com.app.searchapp.ui.home.HomeViewModel viewModel;
    private com.app.searchapp.adapters.ImageAdapter imageAdapter;
    private java.util.ArrayList<com.app.searchapp.model.PixabayImage> imagesList;
    private com.app.searchapp.utils.EndlessScrollListener scrollListener;
    private boolean isPagination = false;
    private java.lang.String mKeyWords = "";
    private java.util.HashMap _$_findViewCache;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void setUpObserver() {
    }
    
    @java.lang.Override()
    public void onImageClicked(@org.jetbrains.annotations.NotNull()
    com.app.searchapp.model.PixabayImage image) {
    }
}