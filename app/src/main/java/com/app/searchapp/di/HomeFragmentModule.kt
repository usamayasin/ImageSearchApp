package com.app.searchapp.di

import com.app.searchapp.ui.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeFragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragmentInjector(): HomeFragment

}