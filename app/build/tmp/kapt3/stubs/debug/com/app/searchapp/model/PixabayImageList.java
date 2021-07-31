package com.app.searchapp.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u00d6\u0001R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/app/searchapp/model/PixabayImageList;", "Landroid/os/Parcelable;", "total", "", "totalHits", "hits", "", "Lcom/app/searchapp/model/PixabayImage;", "(IILjava/util/List;)V", "getHits", "()Ljava/util/List;", "setHits", "(Ljava/util/List;)V", "getTotal", "()I", "getTotalHits", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class PixabayImageList implements android.os.Parcelable {
    private final int total = 0;
    private final int totalHits = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.app.searchapp.model.PixabayImage> hits;
    public static final android.os.Parcelable.Creator<com.app.searchapp.model.PixabayImageList> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.searchapp.model.PixabayImageList copy(int total, int totalHits, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.searchapp.model.PixabayImage> hits) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PixabayImageList(int total, int totalHits, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.searchapp.model.PixabayImage> hits) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTotalHits() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.searchapp.model.PixabayImage> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.searchapp.model.PixabayImage> getHits() {
        return null;
    }
    
    public final void setHits(@org.jetbrains.annotations.NotNull()
    java.util.List<com.app.searchapp.model.PixabayImage> p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.app.searchapp.model.PixabayImageList> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.app.searchapp.model.PixabayImageList createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.app.searchapp.model.PixabayImageList[] newArray(int size) {
            return null;
        }
    }
}