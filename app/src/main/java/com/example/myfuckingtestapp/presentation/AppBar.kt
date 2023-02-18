package com.example.myfuckingtestapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myfuckingtestapp.ui.theme.darkBlue

data class AppBarIconData(
    val onClick: (() -> Unit)? = null,
    val icon: ImageVector? = null
)

@Composable
fun AppBar(
    leftIcon : AppBarIconData = AppBarIconData(),
    text : String = "",
    rightIcon : AppBarIconData = AppBarIconData()
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { leftIcon.onClick?.invoke() }, enabled = leftIcon.onClick != null) {
            leftIcon.icon?.let { Icon(imageVector = it, contentDescription = null) }
        }
        Text(text, fontWeight = FontWeight.W600, color = darkBlue)
        IconButton(onClick = { rightIcon.onClick?.invoke() }, enabled = rightIcon.onClick != null) {
            rightIcon.icon?.let { Icon(imageVector = it, contentDescription = null) }
        }
    }
}