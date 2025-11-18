package com.github.eduardashiratsu.gs2_rm551188_rm551665.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.compose.ui.graphics.Color


private val LightColorScheme = lightColorScheme(
    primary = DudaGreen,
    onPrimary = SurfaceSoft,
    primaryContainer = DudaGreenLight,
    onPrimaryContainer = TextPrimary,

    secondary = DudaLilac,
    onSecondary = SurfaceSoft,
    secondaryContainer = DudaLilacLight,
    onSecondaryContainer = TextPrimary,

    tertiary = DudaPink,
    onTertiary = SurfaceSoft,

    background = BackgroundSoft,
    onBackground = TextPrimary,
    surface = SurfaceSoft,
    onSurface = TextPrimary,
    surfaceVariant = BackgroundSoft,
    onSurfaceVariant = TextSecondary,
    error = Color(0xFFB3261E),
    onError = SurfaceSoft
)

private val DarkColorScheme = darkColorScheme(
    primary = DudaGreenLight,
    onPrimary = TextPrimary,
    background = Color(0xFF111827),
    onBackground = Color(0xFFE5E7EB),
    surface = Color(0xFF111827),
    onSurface = Color(0xFFE5E7EB)
)

@Composable
fun GSTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // deixa false pra não bagunçar as cores
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
