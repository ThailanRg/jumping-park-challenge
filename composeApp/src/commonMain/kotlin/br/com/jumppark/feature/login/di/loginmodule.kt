package br.com.jumppark.feature.login.di

import br.com.jumppark.feature.login.LoginViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val loginModule = module {
    viewModel { LoginViewModel() }
}

