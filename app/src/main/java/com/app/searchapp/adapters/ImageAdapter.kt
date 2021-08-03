package com.app.searchapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.app.searchapp.databinding.PhotoItemLayoutBinding
import com.app.searchapp.model.PixabayImage
import com.bumptech.glide.Glide
import java.util.ArrayList

class ImageAdapter(
    var context: Context, listModels: List<PixabayImage>,
    private val listener: ImageClickListener
) :
    RecyclerView.Adapter<ImageAdapter.ImagesViewHolder>() {

    interface ImageClickListener {
        fun onImageClicked(image: PixabayImage)
    }

    var listModels: ArrayList<PixabayImage>

    init {
        this.listModels = listModels as ArrayList<PixabayImage>
    }

    fun setDataList(listModels: List<PixabayImage>) {
        this.listModels = listModels as ArrayList<PixabayImage>
        notifyDataSetChanged()
    }

    fun appendDataList(dataList: List<PixabayImage>) {
        listModels.addAll(dataList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ImagesViewHolder {
        val photoItemLayoutBinding = PhotoItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context)
        )

        return ImagesViewHolder(photoItemLayoutBinding, listModels, context)
    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        val data: PixabayImage = listModels[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return listModels.size
    }

    inner class ImagesViewHolder(
        private val itemViewDataBinding: PhotoItemLayoutBinding,
        imagesList: List<PixabayImage>,
        var context: Context
    ) :
        RecyclerView.ViewHolder(itemViewDataBinding.root), View.OnClickListener {

        var dataList: List<PixabayImage>

        override fun onClick(v: View) {
            listener.onImageClicked(dataList[adapterPosition])
        }

        init {
            dataList = imagesList
            try {
                itemViewDataBinding.root.setOnClickListener(this)
            } catch (e: Exception) {
                Toast.makeText(context, "Error in View Holder " + e.message, Toast.LENGTH_LONG).show()
            }
        }

        fun bind(item: PixabayImage) {
            itemViewDataBinding.data = item
            Glide.with(itemViewDataBinding.root.context).load(item.previewURL).into(itemViewDataBinding.imgPhoto)
        }
    }
}