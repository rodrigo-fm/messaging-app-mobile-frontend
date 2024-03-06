package com.example.compose.template

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.template.modules.authentication.presentation.screens.username.UsernameScreen
import com.example.compose.template.modules.chat.presentation.screens.home.HomeScreen
import com.example.compose.template.modules.splash.presentation.screens.splash.SplashScreen

const val HOME_ROUTE = "home"
const val USERNAME_ROUTE = "username"
private const val SPLASH_ROUTE = "splash"

@Composable
fun Navigator() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SPLASH_ROUTE
    ) {
        composable(route = SPLASH_ROUTE) {
            SplashScreen(
                viewModel = hiltViewModel(),
                navController = navController,
            )
        }
        composable(route = HOME_ROUTE) {
            HomeScreen(
                viewModel = hiltViewModel(),
            )
        }
        composable(route = USERNAME_ROUTE) {
            UsernameScreen(
                navController = navController,
                viewModel = hiltViewModel()
            )
        }
    }
}