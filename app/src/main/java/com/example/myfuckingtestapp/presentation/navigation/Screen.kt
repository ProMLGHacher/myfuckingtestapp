package com.example.myfuckingtestapp.presentation.navigation

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object CategoryScreen : Screen("category_screen")
    object ProductDetailScreen : Screen("product_detail_screen")
}
