package com.minphone.shareviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val currentClickedFragment = MutableLiveData<String>()

    fun updateCurrentClickedFragment(msg: String) {
        currentClickedFragment.value = msg
    }

    fun getCurrentClickedFragment(): LiveData<String> {
        return currentClickedFragment
    }

}