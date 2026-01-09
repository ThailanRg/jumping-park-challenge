package br.com.jumpark.jumppark.feature.mainscreen.presentation

import br.com.jumpark.jumppark.feature.mainscreen.data.Payment
import br.com.jumpark.jumppark.feature.mainscreen.data.PaymentMethod
import br.com.jumpark.jumppark.feature.mainscreen.data.Price
import br.com.jumpark.jumppark.feature.mainscreen.data.Vehicle

data class MainUiState(
    val prices: List<Price> = emptyList(),
    val paymentMethods: List<PaymentMethod> = emptyList(),
    val vehiclesInPatio: List<Vehicle> = emptyList(),
    val paymentsOutPatio: List<Payment> = emptyList()
)