package com.example.compose.template.modules.authentication.presentation.screens.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.compose.template.modules.authentication.domain.usecases.Login
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: Login
) : ViewModel() {

    val login = MutableLiveData("")
    val password = MutableLiveData("")

    fun setLogin(value: String) { login.value = value }

    fun setPassword(value: String) { password.value = value}

    // TODO: validate form fields before sending
    suspend fun login() {
        loginUseCase.execute(login.value ?: "", password.value ?: "")
    }
}