package com.hmdrh.koinframeworkmvvm.di

import com.hmdrh.koinframeworkmvvm.viewmodel.MainViewModel
import com.hmdrh.koinframeworkmvvm.viewmodel.Test
import com.hmdrh.koinframeworkmvvm.viewmodel.TestImp
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val mVVMModul = module {

    factory { TestImp() } bind Test::class
    viewModel { MainViewModel(get()) }

}