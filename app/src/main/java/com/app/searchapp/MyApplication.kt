package com.app.searchapp

import android.app.Application
import com.app.searchapp.di.ApiModule
import com.app.searchapp.di.AppModule
import com.app.searchapp.di.DaggerAppComponent
import com.app.searchapp.utils.SearchAppConst
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

open class MyApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var mInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
            .builder()
            .apiModule(ApiModule(SearchAppConst.Keys.BASE_URL))
            .appModule(AppModule(this))
            .build()
            .inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return mInjector
    }
}