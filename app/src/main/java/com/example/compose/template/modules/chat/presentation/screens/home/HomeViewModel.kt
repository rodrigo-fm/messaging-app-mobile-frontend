package com.example.compose.template.modules.chat.presentation.screens.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    private val _placeholder = MutableLiveData<List<String>>(listOf())
    val placeholder: LiveData<List<String>> = _placeholder

    fun getPosts() = _placeholder.postValue(listOf())

//    suspend fun getPosts() = _placeholder.postValue(listOf())
}