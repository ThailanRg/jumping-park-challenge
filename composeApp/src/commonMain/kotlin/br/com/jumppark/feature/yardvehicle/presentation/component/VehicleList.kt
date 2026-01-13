package br.com.jumppark.feature.yardvehicle.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import br.com.jumppark.feature.yardvehicle.util.VehicleStatusEnum

@Composable
fun VehicleList() {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item {
            VehicleItem(
                plate = "ABC-1234",
                model = "Toyota Corolla · Silver",
                time = "10:30 AM",
                duration = "2h 15m",
                status = VehicleStatusEnum.PAID
            )
        }
        item {
            VehicleItem(
                plate = "XYZ-9876",
                model = "Honda Civic · Black",
                time = "08:15 AM",
                duration = "4h 30m",
                status = VehicleStatusEnum.OVERSTAY
            )
        }
        item {
            VehicleItem(
                plate = "JKL-5521",
                model = "Tesla Model 3 · White",
                time = "12:05 PM",
                duration = "0h 40m",
                status = VehicleStatusEnum.UNPAID
            )
        }
        item {
            VehicleItem(
                plate = "MNO-4432",
                model = "Ford F-150 · Red",
                time = "12:15 PM",
                duration = "0h 30m",
                status = VehicleStatusEnum.PREPAID
            )
        }
    }
}
