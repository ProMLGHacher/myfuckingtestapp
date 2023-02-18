package com.example.myfuckingtestapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myfuckingtestapp.presentation.detail_category.DetailCategory
import com.example.myfuckingtestapp.presentation.main_screen.MainScreen
import com.example.myfuckingtestapp.presentation.product_detail.ProductDetail

@Composable
fun NavigationApp(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(Screen.MainScreen.route) {
            MainScreen(
                navController = navController
            )
        }
        composable(Screen.CategoryScreen.route) {
            DetailCategory(
                navController = navController
            )
        }
        composable(Screen.ProductDetailScreen.route) {
            ProductDetail(
                navController = navController
            )
        }
    }
}