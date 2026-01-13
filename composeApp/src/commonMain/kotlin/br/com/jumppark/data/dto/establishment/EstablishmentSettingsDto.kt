package br.com.jumppark.data.dto.establishment

import kotlinx.serialization.Serializable

@Serializable
data class EstablishmentSettingsDto(
    val establishmentId: Int,
    val cashReserve: String,
    val withdrawal: Int,
    val print: Int,
    val accountId: Int
)



