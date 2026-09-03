package com.example.base;

import io.github.tritium_launcher.api.extension.Extension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.module.Module;
import java.util.Collections;
import java.util.List;

public class BaseExtension implements Extension {

    @NotNull
    @Override
    public String getNamespace() {
        return "base-extension";
    }

    @NotNull
    @Override
    public List<Module> getModules() {
        return Collections.emptyList();
    }

    @Override
    public boolean isBuiltin() {
        return false;
    }

    @Override
    public boolean getRequiresRestart() {
        return true;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Base Extension";
    }

    @Nullable
    @Override
    public String getDescription() {
        return "Template description";
    }
}
