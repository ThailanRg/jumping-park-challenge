package br.com.jumpark.feature.main.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.jumpark.feature.main.data.ParkingRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){
    private val repository = ParkingRepository()
    private val _uiState = MutableStateFlow(MainUiState())
    val uiState: StateFlow<MainUiState> = _uiState

    fun loadOperationalData() {
        viewModelScope.launch{
            val prices = repository.loadPrices()
            val paymentMethods = repository.loadPaymentMethods()
            val vehicles = repository.getVehiclesInPatio()
            val payments = repository.getPaymentsOutPatio()


            _uiState.value = MainUiState(
                prices = prices,
                paymentMethods = paymentMethods,
                vehiclesInPatio = vehicles,
                paymentsOutPatio = payments
            )
        }
    }
}