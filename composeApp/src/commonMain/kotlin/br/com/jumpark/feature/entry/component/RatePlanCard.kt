package br.com.jumpark.feature.entry.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jumpark.feature.entry.util.RatePlanEnum

@Composable
fun RatePlanCard(plan: RatePlanEnum, selected: RatePlanEnum, onSelect: (RatePlanEnum) -> Unit) {
    val isSelected = plan == selected
    Card(
        onClick = { onSelect(plan) },
        modifier = Modifier
            .width(110.dp)
            .height(90.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isSelected) Color(0xFF1EEA6E) else Color(0xFF162B22)
        ),
        shape = RoundedCornerShape(14.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                Icons.Default.Schedule,
                contentDescription = null,
                tint = if (isSelected) Color.Black else Color.White
            )
            Column {
                Text(
                    plan.title,
                    color = if (isSelected) Color.Black else Color.White,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    plan.price,
                    fontSize = 12.sp,
                    color = if (isSelected) Color.Black else Color.Gray
                )
            }
        }
    }
}
