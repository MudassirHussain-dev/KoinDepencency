package com.hmdrh.koinframeworkmvvm.container

import com.hmdrh.koinframeworkmvvm.`interface`.MyMain
import com.hmdrh.koinframeworkmvvm.classes.Car
import com.hmdrh.koinframeworkmvvm.viewmodel.MainViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

class Component : KoinComponent {

    // lazily
    val car: Car by inject()

    /*// eagerly
    val car1: Car = get()*/

    val myMain: MyMain by inject()

    val mainViewModel: MainViewModel by inject()
}