package com.app.searchapp.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.searchapp.MyApplication
import com.app.searchapp.data.repository.Repository
import com.app.searchapp.ui.home.HomeViewModel
import javax.inject.Inject

class ViewModelFactory :ViewModelProvider.Factory{


    lateinit var appComponent: AppComponent

    @Inject
    lateinit var repository: Repository

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        appComponent =  MyApplication.appComponent
        appComponent.inject(this)

        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}