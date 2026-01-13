package br.com.jumppark.data.dto.payment

import kotlinx.serialization.Serializable

@Serializable
data class PaymentMethodDto(
    val establishmentPaymentMethodId: Int,
    val paymentMethodName: String,
    val primitivePaymentMethodId: Int,
    val receivingDays: Int,
    val receivingFee: String,
    val accountId: Int
)