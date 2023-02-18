package com.example.myfuckingtestapp.presentation.product_detail

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.sharp.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.startActivity
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
        Button(onClick = { }) {

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