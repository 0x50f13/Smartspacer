package com.kieronquinn.app.smartspacer.sdk.model

import androidx.annotation.RestrictTo

enum class UiSurface(val surface: String) {
    HOMESCREEN("home"),
    LOCKSCREEN("lockscreen"),
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    MEDIA_DATA_MANAGER("media_data_manager"),
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    GLANCEABLE_HUB("glanceable_hub");

    companion object {
        fun from(surface: String): UiSurface {
            return values().firstOrNull { it.surface == surface } ?: HOMESCREEN
        }
    }
}