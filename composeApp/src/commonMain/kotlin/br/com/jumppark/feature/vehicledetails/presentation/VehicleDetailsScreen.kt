package br.com.jumppark.feature.vehicledetails.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import br.com.jumppark.feature.vehicledetails.PaymentMethod
import br.com.jumppark.feature.vehicledetails.presentation.component.PaymentMethodsRow
import br.com.jumppark.feature.vehicledetails.presentation.component.StayInformationCard
import br.com.jumppark.feature.vehicledetails.presentation.component.TopBarDetails
import br.com.jumppark.feature.vehicledetails.presentation.component.VehicleImageCard
import br.com.jumppark.feature.vehicledetails.presentation.component.VehicleInfoCard
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun VehicleDetailsScreen() {
    var selectedPayment by remember { mutableStateOf(PaymentMethod.CASH) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0E1B14))
            .padding(16.dp)
    ) {
        TopBarDetails()
        Spacer(Modifier.height(16.dp))
        VehicleImageCard()
        Spacer(Modifier.height(16.dp))
        VehicleInfoCard()
        Spacer(Modifier.height(12.dp))
        StayInformationCard()
        Spacer(Modifier.height(16.dp))
        Text("Select Payment Method", color = Color.White, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(12.dp))
        PaymentMethodsRow(selectedPayment) { selectedPayment = it }
        Spacer(Modifier.weight(1f))
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1EEA6E)),
            shape = RoundedCornerShape(14.dp)
        ) {
            Text("PROCESS CHECKOUT", fontWeight = FontWeight.Bold)
            Spacer(Modifier.width(8.dp))
            Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VehicleDetailsPreview() {
    VehicleDetailsScreen()
}
