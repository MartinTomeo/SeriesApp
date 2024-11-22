package com.example.apiseries

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apiseries.databinding.ShowListLayoutBinding
import com.example.apiseries.model.ShowModelItem
import com.example.apiseries.view.ShowListAdapter


class ShowList : AppCompatActivity() {

    private lateinit var binding: ShowListLayoutBinding
    private lateinit var showListAdapter: ShowListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ShowListLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val showsData = intent.getParcelableArrayListExtra<ShowModelItem>("SHOWS_DATA")



        showsData?.let {
            Log.d("ADAPTER", "data sent to viewholder")
            showListAdapter = ShowListAdapter(it) { show ->

                binding.showListUI.visibility = View.GONE

                // Handle item click: Show the details in fragment
                val fragment = ShowDetailFragment.newInstance(show)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, fragment)  // Replace with your container ID
                    .addToBackStack(null)
                    .commit()
            }
            binding.showListRV.layoutManager = LinearLayoutManager(this)
            binding.showListRV.adapter = showListAdapter
        } ?: run {
            Log.d("ADAPTER", "data is null")
        }


        val backButton: Button = binding.backBtn
        backButton.setOnClickListener {

            finish()
        }
    }


    override fun onBackPressed() {

        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack() // Remove the last fragment
            showListLayout()
        } else {
            super.onBackPressed()
        }


        if (supportFragmentManager.backStackEntryCount == 0) {
            showListLayout()
        }
    }

    fun showListLayout() {
        binding.showListUI.visibility = View.VISIBLE
    }
}