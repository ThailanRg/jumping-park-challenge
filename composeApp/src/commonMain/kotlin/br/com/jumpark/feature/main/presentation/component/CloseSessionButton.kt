package br.com.jumpark.feature.main.presentation.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CloseSessionButton() {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE74C3C)),
        shape = RoundedCornerShape(12.dp)
    ) {
        Icon(Icons.AutoMirrored.Filled.ExitToApp, contentDescription = null)
        Spacer(modifier = Modifier.width(8.dp))
        Text("Close Work Session")
    }
}