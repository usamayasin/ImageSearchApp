package com.app.searchapp.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.pedant.SweetAlert.SweetAlertDialog
import com.app.searchapp.R
import com.app.searchapp.adapters.ImageAdapter
import com.app.searchapp.databinding.HomeFragmentBinding
import com.app.searchapp.model.PixabayImage
import com.app.searchapp.utils.EndlessScrollListener
import com.app.searchapp.utils.SearchAppConst
import com.app.searchapp.utils.closeSoftKeyboard
import kotlinx.android.synthetic.main.home_fragment.*
import kotlinx.android.synthetic.main.home_fragment.view.*
import java.util.ArrayList

class HomeFragment : Fragment(), ImageAdapter.ImageClickListener {

    private lateinit var mBinding:HomeFragmentBinding
    private lateinit var viewModel: HomeViewModel
    private var imageAdapter: ImageAdapter? = null
    private var imagesList: ArrayList<PixabayImage> = ArrayList<PixabayImage>()
    private lateinit var scrollListener: EndlessScrollListener
    private var isPagination = false
    private var mKeyWords:String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = HomeFragmentBinding.inflate(inflater)
        return mBinding.root
    }

    @Suppress("DEPRECATION")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        init()
        setUpObserver()
    }

    private fun init() {

        val gridLayoutManager = GridLayoutManager(mBinding.recyclerPopularPhotos.context, 2)
        scrollListener = object : EndlessScrollListener(gridLayoutManager, 2) {
            override fun onLoadMore(page: Int, totalItemsCount: Int, view: RecyclerView?) {
                isPagination = true
                mBinding.progressPhotos.visibility = View.VISIBLE
                viewModel.fetchImages(page, mBinding.txtSearchPhotos.text.toString())
            }
            override fun onCurrentItem(position: Int) {}
        }

        imageAdapter = ImageAdapter(requireContext(), imagesList, this)
        mBinding.recyclerPopularPhotos.run {
            layoutManager = gridLayoutManager
            addOnScrollListener(scrollListener)
            mBinding.recyclerPopularPhotos.adapter = imageAdapter
        }

        if (mKeyWords.isEmpty()) {
            mBinding.progressPhotos.visibility = View.VISIBLE
            viewModel.fetchImages(1, "fruits")
            mBinding.lblPopular.text =
                requireActivity().getString(R.string.popular_data, "fruits")
        } else{
            viewModel.fetchImages(1,mKeyWords)
            mBinding.lblPopular.text =
                getString(R.string.popular_data, mKeyWords)
        }

        mBinding.txtSearchPhotos.setOnEditorActionListener(TextView.OnEditorActionListener { v, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                isPagination = false
                v.closeSoftKeyboard()
                mKeyWords = mBinding.txtSearchPhotos.text.toString()
                mBinding.progressPhotos.visibility = View.VISIBLE
                viewModel.fetchImages(1, mBinding.txtSearchPhotos.text.toString())
                if (mBinding.txtSearchPhotos.text.toString() != "") {
                    mBinding.lblPopular.text =
                        getString(R.string.popular_data, mBinding.txtSearchPhotos.text.toString())
                } else {
                    mBinding.lblPopular.text =
                        requireActivity().getString(R.string.popular_data, "fruits")
                }
                return@OnEditorActionListener true
            }
            false
        })
    }

    private fun setUpObserver() {
        viewModel.imageLiveData.observe(requireActivity()) {
            mBinding.progressPhotos.visibility = View.GONE

            if (it.isEmpty()) {
                mBinding.tvNoData.visibility = View.VISIBLE
                imageAdapter?.setDataList(it)
            } else {
                mBinding.tvNoData.visibility = View.GONE
                if (!isPagination) imageAdapter?.setDataList(it) else imageAdapter?.appendDataList(
                    it
                )
            }
        }
    }

//    override fun onResume() {
//        if(mKeyWords.isNotEmpty()){
//            viewModel.fetchImages(1,mKeyWords)
//            mBinding.lblPopular.text =
//                getString(R.string.popular_data, mKeyWords)
//        }
//        super.onResume()
//    }

    override fun onImageClicked(image: PixabayImage) {
        val bundle = bundleOf(
            SearchAppConst.CONST_IMAGE_KEY to image.largeImageURL,
            SearchAppConst.CONST_USERNAME_KEY to image.user,
            SearchAppConst.CONST_TAGS_KEY to image.tags,
            SearchAppConst.CONST_LIKES_KEY to image.likes.toString(),
            SearchAppConst.CONST_DOWNLOADS_KEY to image.downloads.toString(),
            SearchAppConst.CONST_COMMENTS_KEY to image.comments.toString()
        )

        SweetAlertDialog(context, SweetAlertDialog.SUCCESS_TYPE)
            .setTitleText("You want to see details?")
            .setConfirmText("Yes")
            .setCancelText("No")
            .setCancelClickListener { it.dismiss() }
            .setConfirmClickListener { sDialog ->
                sDialog.dismiss()
                Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
                    .navigate(R.id.toPhotoDetailFragment, bundle)
            }
            .show()
    }
}