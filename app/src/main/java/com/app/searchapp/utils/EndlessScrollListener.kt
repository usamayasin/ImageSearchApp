package com.app.searchapp.utils

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

/**
 * Created by Nikunj on 27/07/20.
 */
abstract class EndlessScrollListener : RecyclerView.OnScrollListener {

    // The minimum amount of items to have below your current scroll position
    // before loading more.
    private var visibleThreshold: Int

    // The current offset index of data you have loaded
    private var currentPage = 0

    // The total number of items in the dataset after the last load
    private var previousTotalItemCount = 0

    // True if we are still waiting for the last set of data to load.
    private var loading = true

    // Sets the starting page index
    private var startingPageIndex = 0

    private var mLayoutManager: RecyclerView.LayoutManager

    constructor(
        layoutManager: LinearLayoutManager,
        visibleThreshold: Int = 5,
        startingPageIndex: Int = 0
    ) {
        mLayoutManager = layoutManager
        this.visibleThreshold = visibleThreshold
        this.startingPageIndex = startingPageIndex
    }

    constructor(
        layoutManager: GridLayoutManager,
        visibleThreshold: Int = 5,
        startingPageIndex: Int = 0
    ) {
        mLayoutManager = layoutManager
        this.visibleThreshold = visibleThreshold * layoutManager.spanCount
        this.startingPageIndex = startingPageIndex
    }

    constructor(
        layoutManager: StaggeredGridLayoutManager,
        visibleThreshold: Int = 5,
        startingPageIndex: Int = 0
    ) {
        mLayoutManager = layoutManager
        this.visibleThreshold = visibleThreshold * layoutManager.spanCount
        this.startingPageIndex = startingPageIndex
    }

    private fun getLastVisibleItem(lastVisibleItemPositions: IntArray): Int {
        var maxSize = 0
        for (i in lastVisibleItemPositions.indices) {
            if (i == 0) {
                maxSize = lastVisibleItemPositions[i]
            } else if (lastVisibleItemPositions[i] > maxSize) {
                maxSize = lastVisibleItemPositions[i]
            }
        }
        return maxSize
    }

    // This happens many times a second during a scroll, so be wary of the code you place here.
    // We are given a few useful parameters to help us work out if we need to load some more data,
    // but first we check if we are waiting for the previous load to finish.
    override fun onScrolled(view: RecyclerView, dx: Int, dy: Int) {
        var lastVisibleItemPosition = 0
        var firstVisibleItemPosition = 0
        val totalItemCount = mLayoutManager.itemCount

        when (mLayoutManager) {
            is StaggeredGridLayoutManager -> {
                (mLayoutManager as StaggeredGridLayoutManager).let {
                    val lastVisibleItemPositions = it.findLastVisibleItemPositions(null)
                    // get maximum element within the list
                    lastVisibleItemPosition = getLastVisibleItem(lastVisibleItemPositions)

                    firstVisibleItemPosition =
                        getLastVisibleItem(it.findFirstVisibleItemPositions(null))
                }

            }
            is GridLayoutManager -> {
                (mLayoutManager as GridLayoutManager).let {
                    firstVisibleItemPosition = it.findFirstVisibleItemPosition()
                    lastVisibleItemPosition =
                        it.findLastVisibleItemPosition()
                }

            }
            is LinearLayoutManager -> {
                (mLayoutManager as LinearLayoutManager).let {
                    firstVisibleItemPosition = it.findFirstVisibleItemPosition()
                    lastVisibleItemPosition = it.findLastVisibleItemPosition()

                }
            }
        }

        // If the total item count is zero and the previous isn't, assume the
        // list is invalidated and should be reset back to initial state
        if (totalItemCount < previousTotalItemCount) {
            currentPage = startingPageIndex
            previousTotalItemCount = totalItemCount
            if (totalItemCount == 0) {
                loading = true
            }
        }

        // If it’s still loading, we check to see if the dataset count has
        // changed, if so we conclude it has finished loading and update the current page
        // number and total item count.
        if (loading && totalItemCount > previousTotalItemCount) {
            loading = false
            previousTotalItemCount = totalItemCount
        }

        // If it isn’t currently loading, we check to see if we have breached
        // the visibleThreshold and need to reload more data.
        // If we do need to reload some more data, we execute onLoadMore to fetch the data.
        // threshold should reflect how many total columns there are too
        if (!loading && lastVisibleItemPosition + visibleThreshold > totalItemCount) {
            currentPage++
            onLoadMore(currentPage, totalItemCount, view)
            loading = true
        }/* else {
            onCurrentItem(firstVisibleItemPosition)
        }*/
    }

    // Call this method whenever performing new searches
    // 1. First, clear the array of data
    // 2. Notify the adapter of the update
    // 3. Reset endless scroll listener when performing a new search
    fun resetState() {
        currentPage = startingPageIndex
        previousTotalItemCount = 0
        loading = true
    }

    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        super.onScrollStateChanged(recyclerView, newState)

        if (newState == RecyclerView.SCROLL_STATE_IDLE) {
            var firstVisibleItemPosition = 0
            when (mLayoutManager) {
                is StaggeredGridLayoutManager -> {
                    (mLayoutManager as StaggeredGridLayoutManager).let {

                        firstVisibleItemPosition =
                            getLastVisibleItem(it.findFirstCompletelyVisibleItemPositions(null))
                    }

                }
                is GridLayoutManager -> {
                    (mLayoutManager as GridLayoutManager).let {
                        firstVisibleItemPosition = it.findFirstCompletelyVisibleItemPosition()
                    }

                }
                is LinearLayoutManager -> {
                    (mLayoutManager as LinearLayoutManager).let {
                        firstVisibleItemPosition = it.findFirstCompletelyVisibleItemPosition()
                    }
                }
            }

            onCurrentItem(position = firstVisibleItemPosition)

        }

    }

    // Defines the process for actually loading more data based on page
    abstract fun onLoadMore(page: Int, totalItemsCount: Int, view: RecyclerView?)

    abstract fun onCurrentItem(position: Int)
}