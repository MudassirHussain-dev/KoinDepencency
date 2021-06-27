package com.hmdrh.koinframeworkmvvm.viewmodel

import android.util.Log

interface Test {
    fun getData()
}

class TestImp : Test{
    override fun getData() {
        Log.d("main", "MVVM example")
    }

}