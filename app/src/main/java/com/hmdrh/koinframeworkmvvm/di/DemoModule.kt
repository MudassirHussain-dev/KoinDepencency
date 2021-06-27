package com.hmdrh.koinframeworkmvvm.di

import com.hmdrh.koinframeworkmvvm.classes.Car
import com.hmdrh.koinframeworkmvvm.classes.Engine
import com.hmdrh.koinframeworkmvvm.classes.Wheel
import org.koin.dsl.module

val demoModule = module {

    factory { Engine() }
    factory { Wheel() }
    factory { Car(get(),get()) }
    //single { Car() }
}