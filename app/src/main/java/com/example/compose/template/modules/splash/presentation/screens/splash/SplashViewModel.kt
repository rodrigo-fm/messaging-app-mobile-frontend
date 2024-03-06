package com.example.compose.template.modules.splash.presentation.screens.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.compose.template.modules.splash.domain.usecases.GetLoginToken
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val getLoginTokenUseCase: GetLoginToken
): ViewModel() {

    private val _isAuthenticated = MutableLiveData<Boolean>(null)
    val isAuthenticated: LiveData<Boolean> = _isAuthenticated

    suspend fun getLoginToken() {
        val token = getLoginTokenUseCase.execute()
        _isAuthenticated.postValue(token != null)
    }

}