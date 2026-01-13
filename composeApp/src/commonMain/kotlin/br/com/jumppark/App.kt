package br.com.jumppark

import VehicleDetailsRoute
import VehicleEntryRoute
import LoginRoute
import MainScreenRoute
import YardVehicleListRoute
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.jumppark.feature.entry.presentation.VehicleEntryScreen
import br.com.jumppark.feature.login.presentation.LoginScreen
import br.com.jumppark.feature.main.presentation.MainScreen
import br.com.jumppark.feature.vehicledetails.presentation.VehicleDetailsScreen
import br.com.jumppark.feature.yardvehicle.presentation.YardVehicleListScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        NavHost(navController, startDestination = LoginRoute) {
            composable<LoginRoute> { LoginScreen() }
            composable<MainScreenRoute> { MainScreen() }
            composable<VehicleDetailsRoute> { VehicleDetailsScreen() }
            composable<VehicleEntryRoute> { VehicleEntryScreen() }
            composable<YardVehicleListRoute> { YardVehicleListScreen() }
        }
    }
}