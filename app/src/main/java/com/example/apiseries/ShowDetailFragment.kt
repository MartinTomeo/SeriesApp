@file:Suppress("DEPRECATION")

package com.example.apiseries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.apiseries.databinding.FragmentMovieDetailBinding
import com.example.apiseries.model.ShowModelItem


class ShowDetailFragment : Fragment() {

    private lateinit var binding: FragmentMovieDetailBinding
    private lateinit var show: ShowModelItem

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMovieDetailBinding.inflate(inflater, container, false)


        arguments?.getParcelable<ShowModelItem>("SHOW_DETAIL")?.let {
            show = it
            displayMovieDetails(show)
        }

        // Handling back button click
        binding.backBtn.setOnClickListener {
            (activity as? ShowList)?.showListLayout()
            requireActivity().supportFragmentManager.popBackStack() // Pop the fragment from the back stack
        }

        return binding.root
    }

    private fun displayMovieDetails(show: ShowModelItem) {
        binding.showTitle.text = show.show?.name ?: "No title available"
        binding.showDescription.text = show.show?.summary ?: "No description available"
    }



    companion object {
        fun newInstance(show: ShowModelItem): ShowDetailFragment {
            val fragment = ShowDetailFragment()
            val bundle = Bundle()
            bundle.putParcelable("SHOW_DETAIL", show) // Pass the movie data to the fragment
            fragment.arguments = bundle
            return fragment
        }
    }
}