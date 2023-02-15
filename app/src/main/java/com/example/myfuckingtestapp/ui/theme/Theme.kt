package com.example.myfuckingtestapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val LightColorPalette = lightColors(
    primary = purple,
    primaryVariant = lightPurple,
    secondary = green,
    background = Color(0xFFFCFCFC)
)

@Composable
fun MyfuckingtestappTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
            colors = LightColorPalette,
            typography = Typography,
            shapes = Shapes,
            content = content
    )
}