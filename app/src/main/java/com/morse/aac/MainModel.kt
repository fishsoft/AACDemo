package com.morse.aac

class MainModel : BaseViewModel<List<GanBean>>() {

    override fun loadData() {
        data.postValue(null)
    }

}