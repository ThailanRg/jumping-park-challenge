package br.com.jumpark.feature.login.di

import br.com.jumpark.feature.login.LoginViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val loginModule = module {
    viewModel { LoginViewModel() }
}

