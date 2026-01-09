package br.com.jumpark.jumppark

import br.com.jumpark.jumppark.feature.app.ui.Platform

class JVMPlatform : Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()