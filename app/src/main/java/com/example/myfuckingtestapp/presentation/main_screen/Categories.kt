package com.example.myfuckingtestapp.presentation.main_screen

import androidx.compose.ui.graphics.Color
import com.example.myfuckingtestapp.R
import com.example.myfuckingtestapp.ui.theme.blue
import com.example.myfuckingtestapp.ui.theme.brown
import com.example.myfuckingtestapp.ui.theme.green
import com.example.myfuckingtestapp.ui.theme.pink

data class Category(
    val name: String,
    val icon: Int,
    val color: Color
)

val categories = listOf(
    Category(
        name = "Living Room",
        icon = R.drawable.living_room,
        color = pink
    ),
    Category(
        name = "Work Space",
        icon = R.drawable.work_space,
        color = blue
    ),
    Category(
        name = "Bedroom",
        icon = R.drawable.bedroom,
        color = brown
    ),
    Category(
        name = "Relax Space",
        icon = R.drawable.relax_space,
        color = green
    )
)

var currentCategory = categories.first()