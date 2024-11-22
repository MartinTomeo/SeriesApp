package com.example.apiseries.view

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apiseries.databinding.ShowListItemBinding
import com.example.apiseries.model.ShowModel
import com.example.apiseries.model.ShowModelItem


class ShowListAdapter (
    private var payload: List<ShowModelItem>,
    private val onItemClick: (ShowModelItem) -> Unit
) : RecyclerView.Adapter<ShowListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowListViewHolder {
        val binding = ShowListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShowListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ShowListViewHolder, position: Int) {
        val item = payload[position]
        holder.render(item)


        holder.itemView.setOnClickListener {
            onItemClick(item)
        }
    }

    override fun getItemCount(): Int = payload.size

    fun updateData(newData: ShowModel) {
        payload = newData
        Log.d("FromAdapterData", "Data from adapter: $payload")
        notifyDataSetChanged()
    }
}