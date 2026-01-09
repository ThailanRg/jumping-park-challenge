package br.com.jumpark.jumppark

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.jumpark.jumppark.feature.app.ui.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "jumppark",
    ) {
        App()
    }
}