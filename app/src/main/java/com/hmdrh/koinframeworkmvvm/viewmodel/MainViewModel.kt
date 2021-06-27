package com.hmdrh.koinframeworkmvvm.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel(val test: Test) : ViewModel() {
    fun getData() {
        test.getData()
    }
}