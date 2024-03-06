package com.example.compose.template.modules.splash.domain.usecases

import com.example.compose.template.modules.authentication.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class GetLoginToken @Inject constructor(
    private val repository: AuthenticationRepository
) {

    suspend fun execute(): String? =
        repository.getLoginToken()

}