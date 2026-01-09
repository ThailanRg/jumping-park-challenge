package br.com.jumpark.jumppark.feature.app.ui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform