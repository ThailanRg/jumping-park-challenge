package br.com.jumpark.feature.vehicledetails.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TopBarDetails() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, tint = Color.White)
        Spacer(Modifier.weight(1f))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("ABC-1234", color = Color.White, fontWeight = FontWeight.Bold)
            Text("HOURLY CUSTOMER", color = Color(0xFF1EEA6E), fontSize = 10.sp)
        }
        Spacer(Modifier.weight(1f))
        Icon(Icons.Default.MoreVert, contentDescription = null, tint = Color.White)
    }
}