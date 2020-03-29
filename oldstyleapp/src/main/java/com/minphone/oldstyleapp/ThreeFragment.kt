package com.minphone.oldstyleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_three.*

class ThreeFragment : Fragment() {

    private lateinit var onClickListener: OnFragmentOneClickListener

    companion object {
        fun getInstance(onClick: OnFragmentOneClickListener): ThreeFragment {
            val fragment = ThreeFragment()
            fragment.onClickListener = onClick
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnFragment.setOnClickListener {
            onClickListener.onClick("he Latest Clicked is Three")
        }
    }

    interface OnFragmentOneClickListener {
        fun onClick(msg: String)
    }
}