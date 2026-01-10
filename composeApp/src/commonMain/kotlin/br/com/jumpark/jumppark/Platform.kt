package br.com.jumpark.jumppark

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform