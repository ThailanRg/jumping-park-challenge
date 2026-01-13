package br.com.jumppark.feature.vehicledetails

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.ui.graphics.vector.ImageVector

enum class PaymentMethod(val label: String, val icon: ImageVector) {
    CASH("Cash", Icons.Default.AttachMoney),
    CREDIT("Credit", Icons.Default.CreditCard),
    DEBIT("Debit", Icons.Default.AccountBalanceWallet)
}