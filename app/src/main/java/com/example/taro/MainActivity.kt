package com.example.taro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.ComposeView
import com.example.taro.ui.screens.DetailedScreen
import kotlinx.coroutines.launch
import tarotApiService


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        setContent {
            TarotCardScreen()
            Navigation()

        }

    }
}

@Composable
fun TarotCardScreen() {
    LaunchedEffect(Unit) {
        val taro = tarotApiService.getRandomCards()
        TaroSource.taroResponse = taro
    }
}



