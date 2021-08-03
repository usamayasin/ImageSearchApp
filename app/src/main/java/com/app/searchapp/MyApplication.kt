package com.app.searchapp

import android.app.Application
import android.content.Context
import com.app.searchapp.di.ApiModule
import com.app.searchapp.di.AppComponent
import com.app.searchapp.di.DaggerAppComponent
import com.app.searchapp.utils.SearchAppConst

open class MyApplication : Application() {

    companion object {
        var ctx: Context? = null
        lateinit var appComponent:AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext
        appComponent = initDaggerComponent()

    }

    open fun initDaggerComponent():AppComponent{
        appComponent = DaggerAppComponent
            .builder()
            .apiModule(ApiModule(SearchAppConst.Keys.BASE_URL))
            .build()
        return  appComponent
    }

}