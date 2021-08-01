package com.app.searchapp.di

import com.app.searchapp.data.repository.Repository
import com.app.searchapp.ui.home.HomeFragment
import com.app.searchapp.ui.home.HomeViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [ApiModule::class])
interface AppComponent {

    fun inject(fragment: HomeFragment)
    fun inject(mHomeViewModel: HomeViewModel)
    fun inject(mRepository: Repository)
    fun inject(viewModelFactory:ViewModelFactory)

}