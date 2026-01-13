package br.com.jumppark.jumppark

import android.app.Application
import br.com.jumppark.di.commonModule
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