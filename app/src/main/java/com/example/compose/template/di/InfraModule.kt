package com.example.compose.template.di

import android.content.Context
import com.example.compose.template.shared.infra.SharedPreferencesManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

private const val AUTHENTICATION_SHARED_PREFERENCES_KEY = "authentication_shared_preferences"
private const val SETTINGS_SHARED_PREFERENCES_KEY = "settings_shared_preferences"

@Module
@InstallIn(SingletonComponent::class)
object InfraModule {

    const val AUTHENTICATION_SHARED_PREFERENCES_NAME = "AuthenticationSharedPreferencesManager"
    private const val SETTINGS_SHARED_PREFERENCES_NAME = "SettingsSharedPreferencesManager"

    @Provides
    @Singleton
    @Named(AUTHENTICATION_SHARED_PREFERENCES_NAME)
    fun provideAuthenticationSharedPreferences(
        @ApplicationContext context: Context
    ): SharedPreferencesManager =
        SharedPreferencesManager(
            context,
            AUTHENTICATION_SHARED_PREFERENCES_KEY
        )

    @Provides
    @Singleton
    @Named(SETTINGS_SHARED_PREFERENCES_NAME)
    fun provideSettingsSharedPreferences(
        @ApplicationContext context: Context
    ): SharedPreferencesManager =
        SharedPreferencesManager(
            context,
            SETTINGS_SHARED_PREFERENCES_KEY
        )
}