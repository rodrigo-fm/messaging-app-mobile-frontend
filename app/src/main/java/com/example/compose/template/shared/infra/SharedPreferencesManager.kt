package com.example.compose.template.shared.infra

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SharedPreferencesManager @Inject constructor(
    @ApplicationContext private val context: Context,
    fileName: String
) {

    private val sharedPreferences = context.getSharedPreferences(
        fileName,
        Context.MODE_PRIVATE
    )

    fun putString(key: String, value: String): Unit = with(sharedPreferences.edit()) {
        putString(key, value)
        apply()
    }

    fun getString(key: String): String? = sharedPreferences.getString(key, null)

}