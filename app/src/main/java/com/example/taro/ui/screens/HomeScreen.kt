package com.example.taro.ui.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.taro.R

@Composable
fun HomeScreen(navController: NavHostController) {

    val bellota = FontFamily(
        Font(R.font.bellota, FontWeight.Normal)
    )

    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFFF9677))
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFF333366))
            )
        }


    }

    Canvas(Modifier.size(585.dp)) {
        drawCircle(Color(0xFFEB3255), radius = 292f, alpha = 0.7f, center = Offset(size.width / 2, size.height / 2 + 292f))
    }

    Text(
        text = "你\n" +
                "好",
        fontSize = 64.sp,
        color = Color(0xFF333366),
        modifier = Modifier.padding(16.dp),
        fontFamily = bellota
    )

    Image(
        painter = painterResource(id = R.drawable.orange_line),
        contentDescription = "Оранжевая линия",
        modifier = Modifier
            .padding(start = 250.dp, top = 4.dp)
            .size(150.dp)

    )

    Image(
        painter = painterResource(id = R.drawable.orange_line),
        contentDescription = "Оранжевая линия",
        modifier = Modifier
            .padding(start = 150.dp, top = 150.dp)
            .size(150.dp)

    )

    Image(
        painter = painterResource(id = R.drawable.orange_line),
        contentDescription = "Оранжевая линия",
        modifier = Modifier
            .padding(start = 200.dp, top = 500.dp)
            .size(150.dp)

    )

    Image(
        painter = painterResource(id = R.drawable.blue_line),
        contentDescription = "Голубая линия",
        modifier = Modifier
            .padding(start = 50.dp, top = 700.dp)
            .size(150.dp)

    )

    Button(onClick = {
        navController.navigate("detailed")
    },
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .padding(top = 650.dp)
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally),

        contentPadding = PaddingValues(
            horizontal = 32.dp,
            vertical = 20.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color(0xFFFFFFFF),
            containerColor = Color(0xFFEB3255)

        )) {
        Text("Get a retelling",
            fontSize = 20.sp,
            fontFamily = bellota)


    }
}