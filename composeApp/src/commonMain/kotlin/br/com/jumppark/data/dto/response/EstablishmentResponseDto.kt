package com.jumppark.data.dto.response

import br.com.jumppark.data.dto.account.AccountDto
import br.com.jumppark.data.dto.category.CategoryDto
import br.com.jumppark.data.dto.damage.*
import br.com.jumppark.data.dto.establishment.EstablishmentSettingsDto
import br.com.jumppark.data.dto.payment.PaymentMethodDto
import br.com.jumppark.data.dto.price.PriceDto
import br.com.jumppark.data.dto.service.ServiceCategoryDto
import kotlinx.serialization.Serializable

@Serializable
data class EstablishmentResponseDto(
    val establishmentSettings: EstablishmentSettingsDto,
    val paymentMethods: List<PaymentMethodDto>,
    val accounts: List<AccountDto>,
    val categories: List<CategoryDto>,
    val prices: List<PriceDto>,
    val serviceCategories: List<ServiceCategoryDto>,
    val damageTypes: List<DamageTypeDto>,
    val vehicleParts: List<VehiclePartDto>,
    val damageCategories: List<DamageCategoryDto>
)