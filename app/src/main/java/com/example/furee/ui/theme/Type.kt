package com.example.furee.ui.theme


import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.furee.R

val mulish = FontFamily(
    listOf(
        Font(R.font.mulish_bold, FontWeight.Bold),
        Font(R.font.mulish_regular, FontWeight.Normal)
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = mulish,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    h3 = TextStyle(
        fontFamily = mulish,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    h2 = TextStyle(
        fontFamily = mulish,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = mulish,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
)