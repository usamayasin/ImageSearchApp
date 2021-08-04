package com.app.searchapp.ui.photodetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.searchapp.R
import com.app.searchapp.databinding.PhotoDetailFragmentBinding
import com.app.searchapp.utils.SearchAppConst
import com.bumptech.glide.Glide

class PhotoDetailFragment : Fragment() {

    private lateinit var mBinding: PhotoDetailFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = PhotoDetailFragmentBinding.inflate(inflater)
        return mBinding.root
    }

    @Suppress("DEPRECATION")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpUi()
    }

    private fun setUpUi() {
        mBinding.tvUsername.text = requireActivity().getString(
            R.string.label_username,
            arguments?.get(SearchAppConst.Keys.CONST_USERNAME_KEY).toString()
        )
        mBinding.tvTags.text = requireActivity().getString(
            R.string.label_tags_by,
            arguments?.get(SearchAppConst.Keys.CONST_TAGS_KEY).toString()
        )
        mBinding.tvLikes.text = arguments?.get(SearchAppConst.Keys.CONST_LIKES_KEY).toString()
        mBinding.tvComments.text = arguments?.get(SearchAppConst.Keys.CONST_COMMENTS_KEY).toString()
        mBinding.tvDownloads.text = arguments?.get(SearchAppConst.Keys.CONST_DOWNLOADS_KEY).toString()
        Glide.with(requireContext()).load(arguments?.get(SearchAppConst.Keys.CONST_IMAGE_KEY).toString())
            .into(mBinding.imgPhoto)
    }
}