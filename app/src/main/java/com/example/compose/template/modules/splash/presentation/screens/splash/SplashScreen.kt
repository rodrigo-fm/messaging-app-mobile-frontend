package com.example.compose.template.modules.splash.presentation.screens.splash

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.compose.template.HOME_ROUTE
import com.example.compose.template.USERNAME_ROUTE
import com.example.compose.template.shared.presentation.Screen

@Preview
@Composable
fun SplashScreenPreview() = SplashScreen(
    viewModel = hiltViewModel(),
    navController = rememberNavController()
)

@Composable
fun SplashScreen(
    viewModel: SplashViewModel,
    navController: NavController,
) {

    val isAuthenticated = viewModel.isAuthenticated.observeAsState()

    LaunchedEffect(Unit) { viewModel.getLoginToken() }

    Screen {
        when (isAuthenticated.value) {
            true -> navController.navigate(HOME_ROUTE)
            false -> navController.navigate(USERNAME_ROUTE)
            null -> Text("LOADING...")
        }
    }
}