package br.com.jumppark

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform