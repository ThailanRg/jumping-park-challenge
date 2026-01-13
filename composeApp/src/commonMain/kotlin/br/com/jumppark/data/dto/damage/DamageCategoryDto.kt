package br.com.jumppark.data.dto.damage

import kotlinx.serialization.Serializable

@Serializable
data class DamageCategoryDto(
    val damageCategoryId: Int,
    val damageCategoryName: String,
    val active: Int
)