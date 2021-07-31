package com.app.searchapp.utils;

import java.lang.System;

/**
 * Created by Nikunj on 27/07/20.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\n\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H&J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J \u0010 \u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0006\u0010#\u001a\u00020\u0016R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/app/searchapp/utils/EndlessScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "visibleThreshold", "", "startingPageIndex", "(Landroidx/recyclerview/widget/LinearLayoutManager;II)V", "Landroidx/recyclerview/widget/GridLayoutManager;", "(Landroidx/recyclerview/widget/GridLayoutManager;II)V", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;II)V", "currentPage", "loading", "", "mLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "previousTotalItemCount", "getLastVisibleItem", "lastVisibleItemPositions", "", "onCurrentItem", "", "position", "onLoadMore", "page", "totalItemsCount", "view", "Landroidx/recyclerview/widget/RecyclerView;", "onScrollStateChanged", "recyclerView", "newState", "onScrolled", "dx", "dy", "resetState", "app_debug"})
public abstract class EndlessScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private int visibleThreshold;
    private int currentPage = 0;
    private int previousTotalItemCount = 0;
    private boolean loading = true;
    private int startingPageIndex = 0;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
    
    public EndlessScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager layoutManager, int visibleThreshold, int startingPageIndex) {
        super();
    }
    
    public EndlessScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.GridLayoutManager layoutManager, int visibleThreshold, int startingPageIndex) {
        super();
    }
    
    public EndlessScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager, int visibleThreshold, int startingPageIndex) {
        super();
    }
    
    private final int getLastVisibleItem(int[] lastVisibleItemPositions) {
        return 0;
    }
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, int dx, int dy) {
    }
    
    public final void resetState() {
    }
    
    @java.lang.Override()
    public void onScrollStateChanged(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int newState) {
    }
    
    public abstract void onLoadMore(int page, int totalItemsCount, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView view);
    
    public abstract void onCurrentItem(int position);
}