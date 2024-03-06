package com.example.compose.template.modules.posts.data.repositories

import com.example.compose.template.modules.posts.domain.repositories.PostRepository

class PostRepositoryImpl: PostRepository {
    override suspend fun getPosts(): List<String> =
        (1..20).map { it.toString() }
}