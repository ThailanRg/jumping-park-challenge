package br.com.jumpark.feature.yardvehicle.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jumpark.feature.yardvehicle.util.VehicleStatusEnum

@Composable
fun StatusChip(status: VehicleStatusEnum) {
    Box(
        modifier = Modifier
            .background(status.color.copy(alpha = 0.2f), RoundedCornerShape(12.dp))
            .padding(horizontal = 10.dp, vertical = 4.dp)
    ) {
        Text(status.label, color = status.color, fontSize = 10.sp, fontWeight = FontWeight.Bold)
    }
}