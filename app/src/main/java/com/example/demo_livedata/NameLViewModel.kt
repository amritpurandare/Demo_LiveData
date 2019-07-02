package com.example.demo_livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameLViewModel : ViewModel() {


    val currentName: MutableLiveData<String> by lazy {

        MutableLiveData<String>()
    }
}