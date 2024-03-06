package com.example.compose.template.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

//    @Provides
//    @Singleton
//    fun providePostRepository(): PostRepository =
//        PostRepositoryImpl()
//
//    @Provides
//    @Singleton
//    fun provideAuthenticationRepository(
//        @Named(InfraModule.AUTHENTICATION_SHARED_PREFERENCES_NAME) sharedPreferencesManager: SharedPreferencesManager
//    ): AuthenticationRepository =
//        AuthenticationRepositoryImpl(sharedPreferencesManager)

}