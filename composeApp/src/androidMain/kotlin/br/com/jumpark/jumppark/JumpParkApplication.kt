package br.com.jumpark.jumppark

import android.app.Application
import br.com.jumpark.di.commonModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent


class JumpParkApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()
        commonModule {
            androidContext(this@JumpParkApplication)
        }
    }

}