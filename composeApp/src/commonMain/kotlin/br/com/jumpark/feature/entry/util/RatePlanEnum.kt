package br.com.jumpark.feature.entry.util

enum class RatePlanEnum(val title: String, val price: String) {
    HOURLY("Hourly", "$5.00 / hr"),
    DAILY("Daily", "$35.00 / day"),
    MONTHLY("Monthly", "$200.00")
}