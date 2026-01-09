package br.com.jumpark.jumppark.feature.mainscreen.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainScreen(viewModel: MainViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0F1E17))
            .padding(16.dp)
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(16.dp))
        VehiclesInYardCard(
            current = 124,
            capacity = 150
        )
        Spacer(modifier = Modifier.height(16.dp))
        PaymentSummaryCard()
        Spacer(modifier = Modifier.height(16.dp))
        TotalRevenueCard(total = "$2,600.50")
        Spacer(modifier = Modifier.weight(1f))
        CloseSessionButton()
    }
}

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color(0xFF1DB954)),
            contentAlignment = Alignment.Center
        ) {
//            Icon(Icons.Default.Person, contentDescription = null, tint = Color.White)
        }
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text("Home Dashboard", color = Color.White, fontWeight = FontWeight.Bold)
            Text("Jump Park Central", color = Color.Gray, fontSize = 12.sp)
        }
//        Icon(Icons.Default.Notifications, contentDescription = null, tint = Color.White)
    }
}

@Composable
fun VehiclesInYardCard(current: Int, capacity: Int) {
    val progress = current / capacity.toFloat()


    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF21E065)),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("VEHICLES IN YARD", fontSize = 12.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                "$current",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text("/ $capacity capacity", color = Color.Black)
            Spacer(modifier = Modifier.height(8.dp))
            LinearProgressIndicator(
                progress = progress,
                color = Color.Black,
                trackColor = Color.Black.copy(alpha = 0.2f)
            )
        }
    }
}


@Composable
fun PaymentSummaryCard() {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF162B22)),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Payment Summary", color = Color.White, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(12.dp))
            PaymentRow("Cash", "$1,200.00")
            PaymentRow("Credit Card", "$850.50")
            PaymentRow("Debit Card", "$430.00")
            PaymentRow("PIX / Other", "$120.00")
        }
    }
}


@Composable
fun PaymentRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(label, color = Color.LightGray)
        Text(value, color = Color.White, fontWeight = FontWeight.Bold)
    }
}


@Composable
fun TotalRevenueCard(total: String) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF173528)),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text("GRAND TOTAL REVENUE", fontSize = 12.sp, color = Color.Gray)
                Text(
                    total,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF21E065)
                )
            }
//            Icon(Icons.Default.TrendingUp, contentDescription = null, tint = Color(0xFF21E065))
        }
    }
}


@Composable
fun CloseSessionButton() {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE74C3C)),
        shape = RoundedCornerShape(12.dp)
    ) {
//        Icon(Icons.Default.ExitToApp, contentDescription = null)
        Spacer(modifier = Modifier.width(8.dp))
        Text("Close Work Session")
    }
}