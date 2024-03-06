package com.example.compose.template.modules.authentication.domain.usecases

import com.example.compose.template.modules.authentication.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class Login @Inject constructor(
    private val repository: AuthenticationRepository
) {

    suspend fun execute(login: String, password: String) {
        val token = repository.login(login, password)
        print("here is the token: $token")
        repository.saveLoginToken(token)
    }

}