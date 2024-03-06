package com.example.compose.template.modules.posts.domain.repositories

interface PostRepository {
    suspend fun getPosts(): List<String>
}