package br.com.jumppark.feature.yardvehicle.util

import androidx.compose.ui.graphics.Color

enum class VehicleStatusEnum(val label: String, val color: Color) {
    PAID("PAID", Color(0xFF1EEA6E)),
    OVERSTAY("OVERSTAY", Color(0xFFF1C40F)),
    UNPAID("UNPAID", Color(0xFF7F8C8D)),
    PREPAID("PRE-PAID", Color(0xFF2ECC71))
}
