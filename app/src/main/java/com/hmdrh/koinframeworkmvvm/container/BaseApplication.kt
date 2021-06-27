package com.hmdrh.koinframeworkmvvm.container

import android.app.Application
import com.hmdrh.koinframeworkmvvm.di.demoModule
import com.hmdrh.koinframeworkmvvm.di.interfaceModul
import com.hmdrh.koinframeworkmvvm.di.mVVMModul
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(demoModule, interfaceModul, mVVMModul)
        }
    }
}