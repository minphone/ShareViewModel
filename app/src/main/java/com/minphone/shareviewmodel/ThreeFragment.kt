package com.minphone.shareviewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_three.*

class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ivLeft.setOnClickListener {
            findNavController().navigate(ThreeFragmentDirections.actionThreeFragmentToTwoFragment())
        }

        val viewModel = requireActivity().let {
            ViewModelProvider(it).get(MainViewModel::class.java)
        }

        btnFragment.setOnClickListener {
            viewModel.updateCurrentClickedFragment("The Latest Clicked Fragment is Three")
        }
    }

}