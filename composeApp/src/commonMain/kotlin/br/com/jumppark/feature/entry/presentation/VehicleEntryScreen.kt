package br.com.jumppark.feature.entry.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Login
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jumppark.feature.entry.component.RatePlanCard
import br.com.jumppark.feature.entry.component.TopBar
import br.com.jumppark.feature.entry.util.RatePlanEnum
import br.com.jumppark.feature.entry.util.outlinedColors
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun VehicleEntryScreen() {
    var plate by remember { mutableStateOf("ABC-1234") }
    var model by remember { mutableStateOf("") }
    var color by remember { mutableStateOf("") }
    var selectedPlan by remember { mutableStateOf(RatePlanEnum.HOURLY) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0E1B14))
            .padding(16.dp)
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(16.dp))
        Text("Vehicle Details", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("Register vehicle arrival at Jump Park", color = Color.Gray, fontSize = 12.sp)

        Spacer(modifier = Modifier.height(24.dp))
        Text("License Plate", color = Color.Gray)
        OutlinedTextField(
            value = plate,
            onValueChange = { plate = it },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.CameraAlt,
                    contentDescription = null,
                    tint = Color(0xFF1EEA6E)
                )
            },
            modifier = Modifier.fillMaxWidth(),
            colors = outlinedColors()
        )

        Spacer(modifier = Modifier.height(16.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            OutlinedTextField(
                value = model,
                onValueChange = { model = it },
                placeholder = { Text("e.g. Toyota Corolla") },
                modifier = Modifier.weight(1f),
                colors = outlinedColors()
            )
            OutlinedTextField(
                value = color,
                onValueChange = { color = it },
                placeholder = { Text("e.g. Silver") },
                modifier = Modifier.weight(1f),
                colors = outlinedColors()
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text("Select Rate Plan", color = Color.White)
        Spacer(modifier = Modifier.height(12.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            RatePlanCard(RatePlanEnum.HOURLY, selectedPlan) { selectedPlan = it }
            RatePlanCard(RatePlanEnum.DAILY, selectedPlan) { selectedPlan = it }
            RatePlanCard(RatePlanEnum.MONTHLY, selectedPlan) { selectedPlan = it }
        }

        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1EEA6E)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Icon(Icons.AutoMirrored.Filled.Login, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text("CONFIRM ENTRY", fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VehicleEntryPreview() {
    VehicleEntryScreen()
}
