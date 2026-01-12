package br.com.jumpark.feature.yardvehicle.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StatCard(
    modifier: Modifier = Modifier,
    title: String,
    value: String,
    highlight: Boolean = false,
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = if (highlight) Color(0xFF173528) else Color(0xFF162B22)
        ),
        shape = RoundedCornerShape(14.dp)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(title, fontSize = 10.sp, color = Color.Gray)
            Text(
                value,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = if (highlight) Color(0xFF1EEA6E) else Color.White
            )
        }
    }
}