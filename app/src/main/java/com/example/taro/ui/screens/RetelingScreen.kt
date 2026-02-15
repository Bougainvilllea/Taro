package com.example.taro.ui.screens

import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
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
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.example.taro.R
import androidx.compose.runtime.rememberCoroutineScope
import com.example.taro.TaroSource
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.res.painterResource
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

@Composable
fun RetelingScreen(navController: NavHostController){

    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f)
                .background(Color(0xFFFF9677)),

            ) {
            Canvas(Modifier.size(585.dp)) {
                drawCircle(Color(0xFFEB3255), radius = 292f, center = Offset(size.width / 2 + 250f, size.height + 150f))
            }
        }

    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.montain_blue),
            contentDescription = "Montain",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            contentScale = ContentScale.FillWidth)
    }

    AndroidView(
        factory = { context ->
            LayoutInflater.from(context).inflate(R.layout.retelling, null, false)
        },
        modifier = Modifier.fillMaxSize(),
        update = { view ->
            val retelling = view.findViewById<TextView>(R.id.retelling)

            retelling.text = TaroSource.taroResponse?.cards[0]?.desс
            }
    )

    IconButton(onClick = { navController.popBackStack() },
        modifier = Modifier.padding(start = 20.dp)) {
        Icon(painter = painterResource(id = R.drawable.arrow_blue),
            contentDescription = "Назад",
            tint = Color.Unspecified)

    }
}