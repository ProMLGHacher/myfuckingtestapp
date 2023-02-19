package com.example.myfuckingtestapp.presentation.product_detail

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.sharp.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myfuckingtestapp.presentation.AppBar
import com.example.myfuckingtestapp.presentation.AppBarIconData

@Composable
fun ProductDetail(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ProductDetailAppBar(navController)
        val k = 40
        Canvas(
            modifier = Modifier
                .padding(60.dp)
                .fillMaxWidth()
                .height(110.dp)
        ) {
            drawArc(
                brush = Brush.linearGradient(
                    0.5f to Color(0xFFAC83FF).copy(alpha = 0.1f),
                    0.7f to Color(0xFF9A69FF).copy(alpha = 0.5f),
                    0.8f to Color(0xFF884DFF),
                    start = center.copy(y = 0f),
                    end = center.copy(y = size.height)
                ),
                startAngle = 0f,
                sweepAngle = 180f,
                size = size,
                style = Stroke(width = 3.dp.toPx()),
                useCenter = false
            )
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color(0xFFAC83FF),
                        Color(0xFF884DFF),
                    )
                ),
                radius = 14.dp.toPx(),
                center = center.copy(
                    y = if (k <= 50)
                        size.height * 0.55f + (size.height - size.height * 0.55f) / 100 * (k * 2)
                    else
                        size.height * 0.55f + (size.height - size.height * 0.55f) / 100 * ((100 - k) * 2),
                    x = 0 + (size.width / 100 * k)
                )
            )
            drawCircle(
                color = Color.White,
                radius = 14.dp.toPx(),
                center = center.copy(
                    y = if (k <= 50)
                        size.height * 0.55f + (size.height - size.height * 0.55f) / 100 * (k * 2)
                    else
                        size.height * 0.55f + (size.height - size.height * 0.55f) / 100 * ((100 - k) * 2),
                    x = 0 + (size.width / 100 * k)
                ),
                style = Stroke(
                    width = 4.dp.toPx()
                )
            )
        }
    }
}

@Composable
fun ProductDetailAppBar(
    navController: NavController
) {
    AppBar(
        leftIcon =
        AppBarIconData(
            icon = Icons.Default.ArrowBack,
            onClick = {
                navController.popBackStack()
            }
        ),
        text = "Product Details",
        rightIcon = AppBarIconData(
            icon = Icons.Sharp.MoreVert,
            onClick = {}
        ),
    )
}