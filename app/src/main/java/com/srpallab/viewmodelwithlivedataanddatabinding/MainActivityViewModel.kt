package com.srpallab.viewmodelwithlivedataanddatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private var count = MutableLiveData<Int>()
    var userName = MutableLiveData<String>()

    val countData : LiveData<Int>
    get() = count



    init {
        count.value = 0
        userName.value = "Shafiqur"
    }

    fun updateCounterByOne() {
        count.value = count.value?.plus(1)
    }

}