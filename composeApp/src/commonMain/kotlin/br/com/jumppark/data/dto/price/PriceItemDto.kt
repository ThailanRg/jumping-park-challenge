package br.com.jumppark.data.dto.price
import kotlinx.serialization.Serializable
@Serializable
data class PriceItemDto(
    val itemId: Int,
    val price: String,
    val period: Int,
    val since: Int
)