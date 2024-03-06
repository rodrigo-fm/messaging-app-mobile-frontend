package com.example.compose.template.modules.authentication.domain.repositories

interface AuthenticationRepository {

    suspend fun login(login: String, password: String): String

    suspend fun saveLoginToken(token: String)

    suspend fun getLoginToken(): String?

}