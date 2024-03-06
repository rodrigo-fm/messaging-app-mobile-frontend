package com.example.compose.template.modules.splash.domain.usecases

import javax.inject.Inject

class GetLoginToken @Inject constructor(
    // private val repository: AuthenticationRepository
) {

    suspend fun execute(): String = ""
//        repository.getLoginToken()

}