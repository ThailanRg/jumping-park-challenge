package br.com.jumpark.feature.main.presentation

import br.com.jumpark.feature.main.data.Payment
import br.com.jumpark.feature.main.data.PaymentMethod
import br.com.jumpark.feature.main.data.Price
import br.com.jumpark.feature.main.data.Vehicle

data class MainUiState(
    val prices: List<Price> = emptyList(),
    val paymentMethods: List<PaymentMethod> = emptyList(),
    val vehiclesInPatio: List<Vehicle> = emptyList(),
    val paymentsOutPatio: List<Payment> = emptyList()
)