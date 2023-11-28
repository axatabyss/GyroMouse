package com.axat.gyromouse.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.axat.gyromouse.R

// Set of Material typography styles to start with
val MontserratFont = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_italic, style = FontStyle.Italic),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_bold, FontWeight.Bold),
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = MontserratFont,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)