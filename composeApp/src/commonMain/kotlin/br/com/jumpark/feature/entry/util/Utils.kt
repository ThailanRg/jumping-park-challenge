package br.com.jumpark.feature.entry.util

import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun outlinedColors() = OutlinedTextFieldDefaults.colors(
    focusedBorderColor = Color(0xFF1EEA6E),
    unfocusedBorderColor = Color(0xFF2C3E35),
    focusedTextColor = Color.White,
    unfocusedTextColor = Color.White,
    focusedPlaceholderColor = Color.Gray,
    unfocusedPlaceholderColor = Color.Gray
)