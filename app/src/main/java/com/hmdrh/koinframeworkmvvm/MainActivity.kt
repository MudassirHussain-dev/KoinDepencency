package com.hmdrh.koinframeworkmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hmdrh.koinframeworkmvvm.container.Component
import org.koin.core.component.KoinApiExtension

@KoinApiExtension
class MainActivity : AppCompatActivity() {
    private val comppnent = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  comppnent.car.getCar()
        //comppnent.myMain.getInterfaceData()

        comppnent.mainViewModel.getData()
    }
}