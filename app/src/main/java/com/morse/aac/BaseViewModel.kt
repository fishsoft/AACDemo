package com.morse.aac

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

abstract class BaseViewModel<T> : ViewModel() {

    lateinit var data: MutableLiveData<T>

    fun getData(): LiveData<T> {
        if (!::data.isInitialized) {
            data = MutableLiveData()
            loadData()
        }
        return data
    }

    abstract fun loadData()
}