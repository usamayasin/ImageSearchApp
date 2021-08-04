package com.app.searchapp.network

import androidx.lifecycle.Observer
import com.app.searchapp.data.network.ApiService
import com.app.searchapp.data.repository.Repository
import com.app.searchapp.model.PixabayImage
import com.app.searchapp.model.PixabayImageList
import com.app.searchapp.ui.home.HomeViewModel
import io.mockk.mockk
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.mockk.impl.annotations.MockK
import io.reactivex.observers.TestObserver
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okio.buffer
import okio.source
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@RunWith(JUnit4::class)
class ApiServiceTest {

    private lateinit var service:ApiService
    private lateinit var mockWebServer: MockWebServer
    private lateinit var viewModel: HomeViewModel

    @MockK
    lateinit var repository: Repository


    @Before
    fun init(){
        mockWebServer = MockWebServer()
        val gson = GsonConverterFactory.create()

        service = Retrofit.Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(gson)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @After
    private fun cleanup(){
        mockWebServer.shutdown()
    }

    @Test
    fun getImagesTest(){
        enqueueResponse("images.json")

        val photosListObserver = mockk<Observer<List<PixabayImage>>>(relaxed = true)

        viewModel = HomeViewModel(repository)
        viewModel.imageLiveData.observeForever(photosListObserver)

        val testObserver = TestObserver<PixabayImageList>()
        service.getImages(1,"cars").subscribe()



    }

    private fun enqueueResponse(filename:String, headers:Map<String,String> = emptyMap()){
        val inputStream = javaClass.classLoader.getResourceAsStream("api-response/$filename")
        val source = inputStream.source().buffer()
        val mockResponse = MockResponse()

        for((key,value ) in headers){
            mockResponse.addHeader(key,value)
        }

        mockWebServer.enqueue(mockResponse.setBody(source.readString(Charsets.UTF_8)))
    }
}
