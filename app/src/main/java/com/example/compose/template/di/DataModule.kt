package com.example.compose.template.di

import com.example.compose.template.modules.authentication.data.repositories.AuthenticationRepositoryImpl
import com.example.compose.template.modules.authentication.domain.repositories.AuthenticationRepository
import com.example.compose.template.modules.posts.data.repositories.PostRepositoryImpl
import com.example.compose.template.modules.posts.domain.repositories.PostRepository
import com.example.compose.template.shared.infra.SharedPreferencesManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun providePostRepository(): PostRepository =
        PostRepositoryImpl()

    @Provides
    @Singleton
    fun provideAuthenticationRepository(
        @Named(InfraModule.AUTHENTICATION_SHARED_PREFERENCES_NAME) sharedPreferencesManager: SharedPreferencesManager
    ): AuthenticationRepository =
        AuthenticationRepositoryImpl(sharedPreferencesManager)

}