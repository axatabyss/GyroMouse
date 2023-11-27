package com.axat.gyromouse.core

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.axat.gyromouse.core.navigation.NavigationRoutes
import com.axat.gyromouse.feature.screen.HomeScreen



@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationRoutes.HomeRoute) {
        composable(route = NavigationRoutes.HomeRoute) {
            HomeScreen(navController = navController)
        }
    }
}