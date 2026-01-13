package br.com.jumppark

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.jumppark.di.commonModule

fun main() = application {
    commonModule()
    Window(
        onCloseRequest = ::exitApplication,
        title = "Jump Park"
    ) {
        App()
    }
}