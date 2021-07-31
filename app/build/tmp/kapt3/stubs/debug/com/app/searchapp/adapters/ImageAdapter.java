package com.app.searchapp.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u00152\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u001c\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016J\u0014\u0010 \u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/app/searchapp/adapters/ImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/app/searchapp/adapters/ImageAdapter$ImagesViewHolder;", "context", "Landroid/content/Context;", "listModels", "", "Lcom/app/searchapp/model/PixabayImage;", "listener", "Lcom/app/searchapp/adapters/ImageAdapter$ImageClickListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/app/searchapp/adapters/ImageAdapter$ImageClickListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Ljava/util/ArrayList;", "getListModels", "()Ljava/util/ArrayList;", "setListModels", "(Ljava/util/ArrayList;)V", "appendDataList", "", "dataList", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataList", "ImageClickListener", "ImagesViewHolder", "app_debug"})
public final class ImageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.app.searchapp.adapters.ImageAdapter.ImagesViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private final com.app.searchapp.adapters.ImageAdapter.ImageClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.app.searchapp.model.PixabayImage> listModels;
    
    public ImageAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.searchapp.model.PixabayImage> listModels, @org.jetbrains.annotations.NotNull()
    com.app.searchapp.adapters.ImageAdapter.ImageClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.app.searchapp.model.PixabayImage> getListModels() {
        return null;
    }
    
    public final void setListModels(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.app.searchapp.model.PixabayImage> p0) {
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.app.searchapp.model.PixabayImage> listModels) {
    }
    
    public final void appendDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.app.searchapp.model.PixabayImage> dataList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.app.searchapp.adapters.ImageAdapter.ImagesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.app.searchapp.adapters.ImageAdapter.ImagesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/app/searchapp/adapters/ImageAdapter$ImageClickListener;", "", "onImageClicked", "", "image", "Lcom/app/searchapp/model/PixabayImage;", "app_debug"})
    public static abstract interface ImageClickListener {
        
        public abstract void onImageClicked(@org.jetbrains.annotations.NotNull()
        com.app.searchapp.model.PixabayImage image);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lcom/app/searchapp/adapters/ImageAdapter$ImagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemViewDataBinding", "Lcom/app/searchapp/databinding/PhotoItemLayoutBinding;", "argg_list", "", "Lcom/app/searchapp/model/PixabayImage;", "context", "Landroid/content/Context;", "(Lcom/app/searchapp/adapters/ImageAdapter;Lcom/app/searchapp/databinding/PhotoItemLayoutBinding;Ljava/util/List;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "dataList", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getItemViewDataBinding", "()Lcom/app/searchapp/databinding/PhotoItemLayoutBinding;", "bind", "", "item", "onClick", "v", "Landroid/view/View;", "app_debug"})
    public final class ImagesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final com.app.searchapp.databinding.PhotoItemLayoutBinding itemViewDataBinding = null;
        @org.jetbrains.annotations.NotNull()
        private android.content.Context context;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<com.app.searchapp.model.PixabayImage> dataList;
        
        public ImagesViewHolder(@org.jetbrains.annotations.NotNull()
        com.app.searchapp.databinding.PhotoItemLayoutBinding itemViewDataBinding, @org.jetbrains.annotations.NotNull()
        java.util.List<com.app.searchapp.model.PixabayImage> argg_list, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.searchapp.databinding.PhotoItemLayoutBinding getItemViewDataBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.app.searchapp.model.PixabayImage> getDataList() {
            return null;
        }
        
        public final void setDataList(@org.jetbrains.annotations.NotNull()
        java.util.List<com.app.searchapp.model.PixabayImage> p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.app.searchapp.model.PixabayImage item) {
        }
    }
}