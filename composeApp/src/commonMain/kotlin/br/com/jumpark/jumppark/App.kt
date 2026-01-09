package br.com.jumpark.jumppark

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import br.com.jumpark.jumppark.feature.mainscreen.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainScreen()
    }
}