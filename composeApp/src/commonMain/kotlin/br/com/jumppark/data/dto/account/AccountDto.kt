package br.com.jumppark.data.dto.account

import kotlinx.serialization.Serializable

@Serializable
data class AccountDto(
    val accountId: Int,
    val accountName: String,
    val bankId: Int?,
    val bankName: String,
    val bankAgency: String,
    val bankAccount: String,
    val accountTypeId: Int
)