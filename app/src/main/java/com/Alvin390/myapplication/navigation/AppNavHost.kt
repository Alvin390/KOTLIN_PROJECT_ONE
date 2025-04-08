package com.Alvin390.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.Alvin390.myapplication.ui.theme.screens.home.home_screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination: String = "home") {
    NavHost(navController=navController,
        modifier = modifier,
        startDestination = startDestination){
            composable (ROUTE_HOME){
                home_screen(navController)
            }

    }



}