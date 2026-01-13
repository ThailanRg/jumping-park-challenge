package br.com.jumppark.data.dto.damage


import kotlinx.serialization.Serializable

@Serializable
data class DamageTypeDto(
    val damageTypeId: Int,
    val damageTypeName: String,
    val active: Int
)