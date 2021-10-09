package com.example.furee.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

@Composable
fun FureeTheme(content: @Composable() () -> Unit) {

    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}