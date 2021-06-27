package com.hmdrh.koinframeworkmvvm.`interface`

import android.util.Log

interface MyInterface {
    fun getData()
}

interface MyInterface1 {
    fun getData1()
}

class MyClassforInterface : MyInterface, MyInterface1 {
    override fun getData() {
        Log.d("main", "My Interface Class_1")
    }

    override fun getData1() {
        Log.d("main", "My Interface Class_2")
    }
}

class MyMain(val myInterface: MyInterface, val interface1: MyInterface1) {
    fun getInterfaceData() {
        myInterface.getData()
        interface1.getData1()
    }
}