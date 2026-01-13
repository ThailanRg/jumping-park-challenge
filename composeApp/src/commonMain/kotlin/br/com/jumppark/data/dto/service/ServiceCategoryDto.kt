package br.com.jumppark.data.dto.service

import kotlinx.serialization.Serializable

@Serializable
data class ServiceCategoryDto(
    val serviceCategoryId: Int,
    val serviceCategoryName: String,
    val active: Int
)