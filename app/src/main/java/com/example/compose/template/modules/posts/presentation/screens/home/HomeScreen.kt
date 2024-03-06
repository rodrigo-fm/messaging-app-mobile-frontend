package com.example.compose.template.modules.posts.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.compose.template.LOGIN_ROUTE
import com.example.compose.template.R
import com.example.compose.template.shared.presentation.Button
import com.example.compose.template.shared.presentation.ScreenTemplate

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() = HomeScreen(
    navController = rememberNavController(),
    viewModel = hiltViewModel()
)

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel,
) {
    val placeholder = viewModel.placeholder.observeAsState(listOf())

    LaunchedEffect(Unit) { viewModel.getPosts() }

    ScreenTemplate(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        placeholder.value.map{ Text(it) }
        Button(
            onClick = { navController.navigate(LOGIN_ROUTE) },
            text = R.string.login
        )
    }
}