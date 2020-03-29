package com.minphone.oldstyleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class OneFragment : Fragment() {

    private lateinit var onClickListener : OnFragmentOneClickListener

    companion object {
        fun getInstance(onClick : OnFragmentOneClickListener): OneFragment{
            val fragment = OneFragment()
            fragment.onClickListener = onClick
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnFragment.setOnClickListener {
            onClickListener.onClick("The Latest Clicked Fragment is One")
        }
    }

    interface OnFragmentOneClickListener {
        fun onClick(msg: String)
    }
}