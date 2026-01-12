package br.com.jumpark.feature.yardvehicle.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatsRow() {
    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        StatCard(modifier = Modifier.weight(1f), "TOTAL VEHICLES", "42")
        StatCard(modifier = Modifier.weight(1f), "AVAILABLE SPACES", "18", highlight = true)
    }
}