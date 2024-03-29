package com.example.compose.template.shared.presentation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PaddingVertical16() {
    Spacer(modifier = Modifier.padding(vertical = 16.dp))
}