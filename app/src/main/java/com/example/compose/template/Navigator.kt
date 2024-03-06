package com.example.compose.template

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.template.modules.authentication.presentation.screens.login.LoginScreen
import com.example.compose.template.modules.posts.presentation.screens.home.HomeScreen
import com.example.compose.template.modules.splash.presentation.screens.splash.SplashScreen

const val HOME_ROUTE = "home"
const val LOGIN_ROUTE = "login"
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
                navController = navController,
                viewModel = hiltViewModel(),
            )
        }
        composable(route = HOME_ROUTE) {
            HomeScreen(
                navController = navController,
                viewModel = hiltViewModel(),
            )
        }
        composable(route = LOGIN_ROUTE) {
            LoginScreen(
                navController = navController,
                viewModel = hiltViewModel()
            )
        }
    }
}