package com.minphone.shareviewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_one.*

class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.fragment_one, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ivRight.setOnClickListener {
            findNavController().navigate(OneFragmentDirections.actionOneFragmentToTwoFragment())
        }


        val viewModel = requireActivity().let {
            ViewModelProvider(it).get(MainViewModel::class.java)
        }

        btnFragment.setOnClickListener {
            viewModel.updateCurrentClickedFragment("The Latest Clicked Fragment is One")
        }
    }
}