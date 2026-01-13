package br.com.jumppark.di

import br.com.jumppark.feature.login.di.loginModule
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.KoinAppDeclaration

fun commonModule(config: KoinAppDeclaration? = null) = startKoin {
    config?.invoke(this)
    modules(loginModule)
}