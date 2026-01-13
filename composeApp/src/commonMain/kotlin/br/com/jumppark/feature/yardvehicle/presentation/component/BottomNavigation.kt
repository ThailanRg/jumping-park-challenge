package br.com.jumppark.feature.yardvehicle.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BottomNavigation() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Yard", color = Color(0xFF1EEA6E))
        Text("Payments", color = Color.Gray)
        Text("Reports", color = Color.Gray)
        Text("Settings", color = Color.Gray)
        FloatingActionButton(onClick = { }, containerColor = Color(0xFF1EEA6E)) {
            Icon(Icons.Default.Add, contentDescription = null)
        }
    }
}
