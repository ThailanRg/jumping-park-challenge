package br.com.jumppark.data.dto.price

import kotlinx.serialization.Serializable

@Serializable
data class PriceDto(
    val establishmentId: Int,
    val typePrice: String,
    val tolerance: Int,
    val maximumPeriod: Int,
    val maximumValue: String,
    val items: List<PriceItemDto>
)