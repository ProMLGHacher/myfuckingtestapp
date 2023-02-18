package com.example.myfuckingtestapp.presentation.detail_category

import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myfuckingtestapp.R
import com.example.myfuckingtestapp.presentation.AppBar
import com.example.myfuckingtestapp.presentation.AppBarIconData
import com.example.myfuckingtestapp.presentation.core.RatingBar
import com.example.myfuckingtestapp.presentation.navigation.Screen
import com.example.myfuckingtestapp.ui.theme.darkBlue
import com.example.myfuckingtestapp.ui.theme.purple

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DetailCategory(
    navController: NavController
) {
    val isPortaint = LocalConfiguration.current.orientation == Configuration.ORIENTATION_PORTRAIT
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        DetailAppBar(navController = navController)
        Filters()
        Spacer(modifier = Modifier.height(26.dp))
        LazyVerticalGrid(
            cells = GridCells.Fixed( if (isPortaint) 2 else 3),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(100) {
                Box(
                    modifier = Modifier
                        .padding(
                            start = if (it % 2 == 0) 0.dp else 8.dp,
                            end = if (it % 2 == 0) 8.dp else 0.dp
                        )
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .clickable {
                            navController.navigate(Screen.ProductDetailScreen.route)
                        }
                        .background(Color.White)
                        .padding(5.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            modifier = Modifier.fillMaxWidth(),
                            painter = painterResource(id = R.drawable.chair),
                            contentDescription = null,
                            contentScale = ContentScale.FillWidth
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        val size = remember {
                            mutableStateOf(16.0)
                        }
                        Text(
                            "Luxury executive chair",
                            fontWeight = FontWeight.W600,
                            fontSize = size.value.sp,
                            color = darkBlue,
                            modifier = Modifier.padding(horizontal = 10.dp),
                            onTextLayout = { res ->
                                if (res.didOverflowWidth) {
                                    size.value = size.value * 0.95
                                }
                            },
                            maxLines = 2,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        RatingBar(rating = 4f, spaceBetween = 3.dp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("\$125", color = purple, fontWeight = FontWeight.W600)
                    }
                }
            }
        }
    }
}

@Composable
fun Filters() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(10) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(id = R.drawable.chair), contentDescription = null)
                Text("Chair")
            }
            if (it != 9) {
                Spacer(modifier = Modifier.width(11.dp))
            }
        }
    }
}

@Composable
fun DetailAppBar(
    navController: NavController
) {
    AppBar(
        text = "Work Space",
        leftIcon = AppBarIconData(
            onClick = {
                navController.popBackStack()
            },
            icon = Icons.Default.ArrowBack
        )
    )
}