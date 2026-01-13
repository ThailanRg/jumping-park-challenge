package br.com.jumppark.feature.main.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import br.com.jumppark.feature.main.presentation.component.CloseSessionButton
import br.com.jumppark.feature.main.presentation.component.HeaderSection
import br.com.jumppark.feature.main.presentation.component.PaymentSummaryCard
import br.com.jumppark.feature.main.presentation.component.TotalRevenueCard
import br.com.jumppark.feature.main.presentation.component.VehiclesInYardCard

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