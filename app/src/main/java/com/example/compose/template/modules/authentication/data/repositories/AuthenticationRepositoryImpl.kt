package com.example.compose.template.modules.authentication.data.repositories

import com.example.compose.template.modules.authentication.domain.repositories.AuthenticationRepository
import com.example.compose.template.shared.infra.SharedPreferencesManager
import javax.inject.Inject

private const val TOKEN_KEY = "auth_token"

class AuthenticationRepositoryImpl @Inject constructor(
    private val sharedPreferencesManager: SharedPreferencesManager
): AuthenticationRepository {

    override suspend fun login(login: String, password: String): String =
        "auth_token_here"

    override suspend fun saveLoginToken(token: String) =
        sharedPreferencesManager.putString(TOKEN_KEY, token)

    override suspend fun getLoginToken(): String? =
        sharedPreferencesManager.getString(TOKEN_KEY)

}