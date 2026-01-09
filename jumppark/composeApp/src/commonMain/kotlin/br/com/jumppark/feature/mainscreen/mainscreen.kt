

@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()) {
    val uiState by viewModel.uiState.collectAsState()


    LaunchedEffect(Unit) {
        viewModel.loadOperationalData()
    }


    LazyColumn(modifier = Modifier.padding(16.dp)) {
        item {
            Text("Veículos no pátio", style = MaterialTheme.typography.titleMedium)
        }
        items(uiState.vehiclesInPatio) { vehicle ->
            Text("Placa: ${vehicle.plate}")
        }


        item {
            Spacer(modifier = Modifier.height(16.dp))
            Text("Pagamentos fora do pátio", style = MaterialTheme.typography.titleMedium)
        }
        items(uiState.paymentsOutPatio) { payment ->
            Text("Veículo: ${payment.plate} - Valor: ${payment.amount}")
        }
    }
}