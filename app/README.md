
IMAGE SEARCH APP developed using (Kotlin/MVVM/Dagger2/Retrofit2/RxJava2/DataBinding)

### Application which retrieves data from PixabayApi (via Retrofit2), saves it into Okhttp cache. There we are applying MVVM architecture pattern with RxJava2,Data Binding and Dagger 2.

# Overview:

* ### Model
   Model is implemented as Repository pattern. Firstly it begins from internet connection checking. Consequently if it's alive we're retrieving data from the server (by using Retrofit 2).

* ### View
   View is realised as 2 fragments. First one contains RecyclerView and search field, second one depends on clicks on recycler-items and finally displays detailed data fetched from the Model.(Showing High Quality image, tags, username along with Number of Likes,Comments and downloads(Favourties are not available in API Response)

* ### ViewModel
   ViewModel is responsible for transferring data between view and model.

* ### Dagger 2
   – Implementation of dependency injection for communication between app modules
   – AndroidInjector applying for injecting into View components
 

# Applied technologies and libraries:

* ### Mode
	* Network
	     	– Retrofit 2
		– getting data from server into pojo-classes
                – okHTTP
	        – Caching data from the server
	        – Gson(converting  json to object)       
	* RxJava2 
      		– managing asynchronous network queries
      		– using instead of callbacks
      		– providing light asynchronous operations

* ### ViewModel
   * LiveData
      – observer-pattern implementation for View interaction
         
* ### View
   * Fragments
     – interactive displaying and click reflecting

   * Data Binding
     – replace basic operations with UI (e.g. findViewById() ) to the XML

## All libraries:
* Android X
* Material libraries 
* Android Jetpack (navGraph)
* Dagger 2
* RxJava2
* Retrofit 2
* OkHTTP
* Gson
* Glide