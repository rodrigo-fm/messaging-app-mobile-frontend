package com.example.compose.template.modules.posts.presentation.screens.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.compose.template.modules.posts.domain.repositories.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: PostRepository
): ViewModel() {

    private val _placeholder = MutableLiveData<List<String>>(listOf())
    val placeholder: LiveData<List<String>> = _placeholder

    suspend fun getPosts() = _placeholder.postValue(repository.getPosts())
}