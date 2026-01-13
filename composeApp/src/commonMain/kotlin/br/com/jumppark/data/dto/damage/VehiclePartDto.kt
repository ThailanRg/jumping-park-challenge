package br.com.jumppark.data.dto.damage

import kotlinx.serialization.Serializable

@Serializable
data class VehiclePartDto(
    val vehiclePartId: Int,
    val vehiclePartName: String,
    val active: Int
)