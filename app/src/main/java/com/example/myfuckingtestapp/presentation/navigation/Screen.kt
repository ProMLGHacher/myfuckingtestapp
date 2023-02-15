package com.example.myfuckingtestapp.presentation.navigation

sealed class Screen(val name: String) {
    object MainScreen : Screen("main_screen")
}
