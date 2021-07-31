package com.app.searchapp.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.searchapp.data.repository.Repository
import com.app.searchapp.model.PixabayImage
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class HomeViewModel : ViewModel() {

    private val disposables = CompositeDisposable()
    private val imagesMutableLiveData = MutableLiveData<List<PixabayImage>>()
    val imageLiveData: LiveData<List<PixabayImage>> = imagesMutableLiveData

    fun fetchImages(page: Int, keyword: String) {
        disposables.add(Repository.getImages(page,keyword)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ result ->
                if (result.isSuccessful) {
                    result.body()?.also {
                            imagesMutableLiveData.postValue(it.hits)
                    }
                } else{
                    Log.e("Error", result.message())
                }
            }, { throwable ->
                Log.e("Exception",throwable.message.toString())
            })
        )
    }


}