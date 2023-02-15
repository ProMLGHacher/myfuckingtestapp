package com.example.myfuckingtestapp.presentation.main_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfuckingtestapp.R
import com.example.myfuckingtestapp.ui.theme.darkBlue
import com.example.myfuckingtestapp.ui.theme.pink

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        AppBar()
        Text(
            "Explore",
            color = Color(0xFF121420),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            "Best furniture for your house!",
            color = Color(0xFFA5A7AC),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(24.dp))
        EbanayaHuynyaSTekstomIEbanoyKnopkoyBlyat()
        Spacer(modifier = Modifier.height(24.dp))
        BudgetFurnitures()
        Spacer(modifier = Modifier.height(30.dp))
        LazyVerticalGrid(cells = GridCells.Fixed(2), contentPadding = PaddingValues(0.dp)) {
            item {
                Box(modifier = Modifier
                    .padding(end = 8.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        Brush.linearGradient(
                            colors = listOf(pink, pink.copy(0.7f)),
                            start = Offset(0f, Float.POSITIVE_INFINITY),
                            end = Offset(Float.POSITIVE_INFINITY, 0f)
                        )
                    )
                    .padding(vertical = 20.dp, horizontal = 16.dp)
                ) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.living_room), contentDescription = "")
                        Text("Living Room")
                    }
                }
            }
            item {
                Box(modifier = Modifier
                    .padding(start = 8.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        Brush.linearGradient(
                            colors = listOf(pink, pink.copy(0.7f)),
                            start = Offset(0f, Float.POSITIVE_INFINITY),
                            end = Offset(Float.POSITIVE_INFINITY, 0f)
                        )
                    )
                    .padding(vertical = 20.dp, horizontal = 16.dp)
                ) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.living_room), contentDescription = "")
                        Text("Living Room")
                    }
                }
            }
        }
    }
}

@Composable
fun BudgetFurnitures() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.budget_furnitures),
            contentDescription = ""
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                Text("Budget Furnitures", fontWeight = FontWeight.W700, lineHeight = 16.sp, color = darkBlue, fontSize = 16.sp)
                Text("All Furnitures Discount", fontWeight = FontWeight.W600, lineHeight = 16.sp, color = darkBlue, fontSize = 13.sp)
            }
            Button(onClick = { /*TODO*/ }) {
                Text("Shop Now")
            }
        }
    }
}

@Composable
fun EbanayaHuynyaSTekstomIEbanoyKnopkoyBlyat() {
    val text = remember {
        mutableStateOf("")
    }
    BasicTextField(
        value = text.value,
        onValueChange = {
            text.value = it
        },
        textStyle = TextStyle(
            color = darkBlue,
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
        ),
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(8.dp))
    ) { innerTextField ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF4F4F5))
        ) {
            Box(
                modifier = Modifier
                    .padding(vertical = 14.dp, horizontal = 16.dp)
                    .align(
                        Alignment.CenterStart
                    )
            ) {
                innerTextField()
            }
            FloatingActionButton(
                onClick = {

                },
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier
                    .align(
                        Alignment.CenterEnd
                    )
                    .height(IntrinsicSize.Max)
                    .padding(6.dp)
                    .clip(RoundedCornerShape(5.dp)),
                backgroundColor = Color(0xFF884DFF),
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = Color.White
                )
            }
            if (text.value == "") {
                Text(
                    text = "Search furniture...",
                    color = Color(0xFFA5A7AC),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .padding(vertical = 14.dp, horizontal = 16.dp)
                        .align(
                            Alignment.CenterStart
                        )
                )
            }

        }
    }
}

@Composable
fun AppBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.offset((-10).dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.burger), contentDescription = null)
        }
        Image(painter = painterResource(id = R.drawable.avatar), contentDescription = null)
    }
}