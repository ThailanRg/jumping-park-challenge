package br.com.jumpark.jumppark.feature.mainscreen

import br.com.jumpark.jumppark.feature.data.Payment
import br.com.jumpark.jumppark.feature.data.PaymentMethod
import br.com.jumpark.jumppark.feature.data.Price
import br.com.jumpark.jumppark.feature.data.Vehicle

data class MainUiState(
    val prices: List<Price> = emptyList(),
    val paymentMethods: List<PaymentMethod> = emptyList(),
    val vehiclesInPatio: List<Vehicle> = emptyList(),
    val paymentsOutPatio: List<Payment> = emptyList()
)