package com.example.apiseries.view

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.apiseries.databinding.ShowListItemBinding
import com.example.apiseries.model.ShowModelItem
import com.squareup.picasso.Picasso

class ShowListViewHolder(private val binding: ShowListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun render(show: ShowModelItem) {
        Log.d("FromViewHolderData", "Data from view holder: $show")

        binding.showTitle.text = show.show?.name ?: "No name found."

        // Load image using Picasso
        val imageUrl = show.show?.image?.medium // Assuming `image.medium` contains the URL
        if (imageUrl != null) {
            Picasso.get()
                .load(imageUrl)
                .into(binding.showImage) // Bind to your ImageView
        }
    }
}