package br.com.jumpark.feature.vehicledetails.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Login
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun StayInformationCard() {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF162B22)),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text("Stay Information", color = Color.White, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(12.dp))
            InfoRow(
                icon = Icons.AutoMirrored.Filled.Login,
                title = "Entry Time",
                subtitle = "Checked in by John D.",
                trailing = "Oct 24, 02:30 PM"
            )
            Spacer(Modifier.height(12.dp))
            InfoRow(
                icon = Icons.Default.Schedule,
                title = "Current Duration",
                subtitle = "Standard Rate Applied",
                trailing = "2h 45m"
            )
        }
    }
}