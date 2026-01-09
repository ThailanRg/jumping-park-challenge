package br.com.jumpark.jumppark.feature.data

import kotlinx.coroutines.delay

class ParkingRepository {
    suspend fun loadPrices(): List<Price> {
        delay(500)
        return listOf(Price("Hora", 10.0))
    }


    suspend fun loadPaymentMethods(): List<PaymentMethod> {
        delay(500)
        return listOf(PaymentMethod("Cartão"), PaymentMethod("PIX"))
    }


    suspend fun getVehiclesInPatio(): List<Vehicle> {
        return listOf(Vehicle("ABC-1234"))
    }


    suspend fun getPaymentsOutPatio(): List<Payment> {
        return listOf(Payment("XYZ-9999", 25.0))
    }
}

data class Vehicle(val plate: String)
data class Payment(val plate: String, val amount: Double)
data class Price(val description: String, val value: Double)
data class PaymentMethod(val name: String)