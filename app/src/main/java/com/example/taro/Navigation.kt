package com.example.taro

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taro.ui.screens.DetailedScreen
import com.example.taro.ui.screens.HomeScreen
import com.example.taro.ui.screens.RetelingScreen

@Composable
fun Navigation(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {

    composable("home") {
        HomeScreen(navController = navController)
    }


    composable("reteling") {
        RetelingScreen(navController = navController)
    }

    composable("detailed") {
        DetailedScreen(navController = navController)
    }
}}

