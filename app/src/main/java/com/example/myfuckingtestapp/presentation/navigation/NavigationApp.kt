package com.example.myfuckingtestapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myfuckingtestapp.presentation.main_screen.MainScreen

@Composable
fun NavigationApp(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = Screen.MainScreen.name) {
        composable(Screen.MainScreen.name) {
            MainScreen()
        }
    }
}