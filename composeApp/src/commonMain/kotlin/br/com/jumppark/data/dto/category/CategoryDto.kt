package br.com.jumppark.data.dto.category

import kotlinx.serialization.Serializable

@Serializable
data class CategoryDto(
    val categoryId: Int,
    val categoryName: String,
    val active: Int
)