package com.example.compose.template.modules.authentication.presentation.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.compose.template.HOME_ROUTE
import com.example.compose.template.R
import com.example.compose.template.shared.presentation.BodyText1
import com.example.compose.template.shared.presentation.Button
import com.example.compose.template.shared.presentation.PasswordInput
import com.example.compose.template.shared.presentation.ScreenTemplate
import com.example.compose.template.shared.presentation.TextInput
import kotlinx.coroutines.launch

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() = LoginScreen(
    viewModel = hiltViewModel(),
    navController = rememberNavController()
)

@Composable
fun LoginScreen(
    navController: NavController,
    viewModel: LoginViewModel
) {
    val maxWidthModifier = Modifier.fillMaxWidth()

    val coroutineScope = rememberCoroutineScope()

    val login = viewModel.login.observeAsState("")
    val password = viewModel.password.observeAsState("")

    ScreenTemplate(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        BodyText1(
            modifier = Modifier.fillMaxWidth(),
            text = R.string.login,
            style =  TextStyle(
                fontSize = 28.sp,
                textAlign = TextAlign.Center,
            )
        )
        Spacer(Modifier.height(16.dp))
        TextInput(
            modifier = maxWidthModifier,
            value = login.value,
            onValueChange = viewModel::setLogin,
            label = R.string.login
        )
        Spacer(Modifier.height(16.dp))
        PasswordInput(
            modifier = maxWidthModifier,
            value = password.value,
            onValueChange = viewModel::setPassword
        )
        Spacer(Modifier.height(16.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            onClick = { coroutineScope.launch {
                viewModel.login()
                navController.navigate(HOME_ROUTE)
            }},
            text = R.string.login,
        )
    }
}