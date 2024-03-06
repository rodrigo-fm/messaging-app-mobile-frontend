package com.example.compose.template.modules.chat.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.compose.template.shared.presentation.Screen

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() = HomeScreen(
    viewModel = hiltViewModel()
)

@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
) {
//    val placeholder = viewModel.placeholder.observeAsState(listOf())

//    LaunchedEffect(Unit) { viewModel.getPosts() }

    Screen(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is a placeholder text")
    }
}