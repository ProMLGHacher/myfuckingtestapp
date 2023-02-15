package com.example.myfuckingtestapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myfuckingtestapp.R

val fontFamily = FontFamily(
        fonts = listOf(
                Font(R.font.nunito_regular, weight = FontWeight.Normal),
                Font(R.font.nunito_black, weight = FontWeight.Black),
                Font(R.font.nunito_bold, weight = FontWeight.Bold),
                Font(R.font.nunito_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
                Font(R.font.nunito_black_italic, weight = FontWeight.Black, style = FontStyle.Italic),
                Font(R.font.nunito_extra_bold, weight = FontWeight.ExtraBold),
                Font(R.font.nunito_extra_bold_italic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
                Font(R.font.nunito_extra_light, weight = FontWeight.ExtraLight),
                Font(R.font.nunito_extra_light_italic, weight = FontWeight.ExtraLight, style = FontStyle.Italic),
                Font(R.font.nunito_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
                Font(R.font.nunito_light, weight = FontWeight.Light),
                Font(R.font.nunito_semi_bold, weight = FontWeight.SemiBold),
                Font(R.font.nunito_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
                Font(R.font.nunito_semi_bold_italic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
                Font(R.font.nunito_medium, weight = FontWeight.Medium),
                Font(R.font.nunito_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
        )
)

// Set of Material typography styles to start with
val Typography = Typography(
        defaultFontFamily = fontFamily
)