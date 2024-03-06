package com.example.compose.template.modules.authentication.presentation.screens.username

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.compose.template.HOME_ROUTE
import com.example.compose.template.shared.presentation.Headline1
import com.example.compose.template.shared.presentation.PaddingVertical16
import com.example.compose.template.shared.presentation.Screen

// TODO: the idea here is that the user types an username
//  and then the app checks on the backend if there are usernames
//  that match the one being typed on the database.
//  after that, we select the username and load messages that
//  are associated to that username (i.e were sent by or sent to that user)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UsernameScreen(
    navController: NavController,
    viewModel: UsernameViewModel
) {

    val username = viewModel.username.observeAsState("")

    Screen(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Headline1(text = "Choose your username")
        PaddingVertical16()
        TextField(
            value = username.value,
            onValueChange = {
                viewModel.username.value = it
                println("current username value: ${username.value}")
            },
            label = { Text("Username") },
        )
        PaddingVertical16()
        Button(
            onClick = { navController.navigate(HOME_ROUTE) },
            enabled = false
        ) {
            Text("Enter")
        }
    }
}

@Preview
@Composable
private fun UsernameScreenPreview() {
    UsernameScreen(
        navController = rememberNavController(),
        viewModel = hiltViewModel()
    )
}