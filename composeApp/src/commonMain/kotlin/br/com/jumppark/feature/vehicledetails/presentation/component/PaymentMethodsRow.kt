package br.com.jumppark.feature.vehicledetails.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.jumppark.feature.vehicledetails.PaymentMethod

@Composable
fun PaymentMethodsRow(selected: PaymentMethod, onSelect: (PaymentMethod) -> Unit) {
    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        PaymentMethodCard(Modifier.weight(1f), PaymentMethod.CASH, selected, onSelect)
        PaymentMethodCard(Modifier.weight(1f), PaymentMethod.CREDIT, selected, onSelect)
        PaymentMethodCard(Modifier.weight(1f), PaymentMethod.DEBIT, selected, onSelect)
    }
}