package com.hmdrh.koinframeworkmvvm.di

import com.hmdrh.koinframeworkmvvm.`interface`.MyClassforInterface
import com.hmdrh.koinframeworkmvvm.`interface`.MyInterface
import com.hmdrh.koinframeworkmvvm.`interface`.MyInterface1
import com.hmdrh.koinframeworkmvvm.`interface`.MyMain
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModul = module {

    // Technique 1
    /* factory { MyClassforInterface() as MyInterface }*/

    // Technique 2
    /* factory<MyInterface> { MyClassforInterface() }*/

    //factory { MyClassforInterface() } bind MyInterface::class

    factory { MyClassforInterface() } binds arrayOf(MyInterface::class, MyInterface1::class)
    factory { MyMain(get(), get()) }

}