package br.com.jumppark.feature.yardvehicle.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jumppark.feature.yardvehicle.presentation.component.BottomNavigation
import br.com.jumppark.feature.yardvehicle.presentation.component.SearchBar
import br.com.jumppark.feature.yardvehicle.presentation.component.StatsRow
import br.com.jumppark.feature.yardvehicle.presentation.component.VehicleList
import br.com.jumppark.feature.yardvehicle.presentation.component.YardTopBar
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun YardVehicleListScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0E1B14))
            .padding(16.dp)
    ) {
        YardTopBar()
        Spacer(Modifier.height(16.dp))
        SearchBar()
        Spacer(Modifier.height(16.dp))
        StatsRow()
        Spacer(Modifier.height(16.dp))
        Text("ACTIVE STAY (12)", color = Color.Gray, fontSize = 12.sp)
        Spacer(Modifier.height(8.dp))
        VehicleList()
        Spacer(Modifier.weight(1f))
        BottomNavigation()
    }
}

@Preview(showBackground = true)
@Composable
fun YardVehicleListPreview() {
    YardVehicleListScreen()
}