package br.com.jumpark.feature.vehicledetails.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jumpark.feature.vehicledetails.PaymentMethod

@Composable
fun PaymentMethodCard(
    modifier: Modifier = Modifier,
    method: PaymentMethod,
    selected: PaymentMethod,
    onSelect: (PaymentMethod) -> Unit,
) {
    val isSelected = method == selected
    Card(
        onClick = { onSelect(method) },
        modifier = modifier
            .height(80.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isSelected) Color(0xFF1EEA6E) else Color(0xFF162B22)
        ),
        shape = RoundedCornerShape(14.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                method.icon,
                contentDescription = null,
                tint = if (isSelected) Color.Black else Color.White
            )
            Spacer(Modifier.height(6.dp))
            Text(
                method.label,
                color = if (isSelected) Color.Black else Color.White,
                fontSize = 12.sp
            )
        }
    }
}

