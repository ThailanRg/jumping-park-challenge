package br.com.jumppark.data.dto.common

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponseDto<T>(
    val response: String,
    val data: T
)