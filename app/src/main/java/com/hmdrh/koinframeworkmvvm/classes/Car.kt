package com.hmdrh.koinframeworkmvvm.classes

import android.util.Log

class Car constructor(val engine: Engine, val wheel: Wheel) {
    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "Car is Running....")
    }
}