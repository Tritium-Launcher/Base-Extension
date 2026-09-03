package com.example.base

import io.github.tritium_launcher.api.extension.Extension
import org.koin.core.module.Module

class BaseExtension : Extension {
    override val namespace: String = "base-extension"
    override val displayName: String = "Base Extension"
    override val description: String = "Template description"
    override val modules: List<Module> = emptyList()
}
