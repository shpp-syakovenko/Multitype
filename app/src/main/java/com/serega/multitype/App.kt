package com.serega.multitype

import android.app.Application
import com.serega.multitype.di.seregaModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startCoin()
    }

    private fun startCoin() {
        startKoin {
            androidContext(this@App)
            modules(seregaModule)
        }
    }
}