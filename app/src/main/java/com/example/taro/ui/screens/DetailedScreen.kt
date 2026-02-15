package com.example.taro.ui.screens

import android.view.LayoutInflater
import android.widget.Button
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.example.taro.R
import android.widget.TextView
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.rememberCoroutineScope
import com.example.taro.TaroSource
import kotlinx.coroutines.launch
import tarotApiService

@Composable
fun DetailedScreen(navController: NavHostController) {

    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
                .background(Color(0xFF333366)),

            ) {
            Canvas(Modifier.size(585.dp)) {
                drawCircle(Color(0xFFEB3255), radius = 292f, center = Offset(size.width / 2, size.height + 150f))
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f)
                .background(Color(0xFFFF9677))
            )
        }

    Image(
        painter = painterResource(id = R.drawable.blue_line),
        contentDescription = "Голубая линия",
        modifier = Modifier
            .padding(start = 10.dp, top = 700.dp)
            .size(150.dp)

    )

    Image(
        painter = painterResource(id = R.drawable.blue_line),
        contentDescription = "Голубая линия",
        modifier = Modifier
            .padding(start = 230.dp, top = 780.dp)
            .size(150.dp)

    )

    Image(
        painter = painterResource(id = R.drawable.blue_line),
        contentDescription = "Голубая линия",
        modifier = Modifier
            .padding(start = 50.dp, top = 850.dp)
            .size(150.dp)

    )

    Image(
        painter = painterResource(id = R.drawable.blue_line),
        contentDescription = "Голубая линия",
        modifier = Modifier
            .padding(start = 250.dp, top = 680.dp)
            .size(150.dp)

    )

    Image(
        painter = painterResource(id = R.drawable.red_line),
        contentDescription = "Оранджевая линия",
        modifier = Modifier
            .padding(start = 140.dp, top = 600.dp)
            .size(150.dp)

    )

    AndroidView(
        factory = { context ->
            LayoutInflater.from(context).inflate(R.layout.detailed, null, false)
        },
        modifier = Modifier.fillMaxSize(),
        update = { view ->
            val detailButton = view.findViewById<Button>(R.id.detailButton)
            val nameCard = view.findViewById<TextView>(R.id.nameCard)
            val aboutCard = view.findViewById<TextView>(R.id.aboutCard)

            detailButton.setOnClickListener {
                navController.navigate("reteling")
            }

            scope.launch{
                nameCard.text = TaroSource.taroResponse?.cards[0]?.name
                aboutCard.text = TaroSource.taroResponse?.cards[0]?.meaningUp
            }
        }
    )

    IconButton(onClick = { navController.popBackStack() },
        modifier = Modifier.padding(start = 20.dp)) {
        Icon(painter = painterResource(id = R.drawable.arrow_orange),
            contentDescription = "Назад",
            tint = Color.Unspecified)

    }



    }

