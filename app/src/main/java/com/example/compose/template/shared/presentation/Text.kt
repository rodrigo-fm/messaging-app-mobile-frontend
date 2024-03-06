package com.example.compose.template.shared.presentation

import androidx.annotation.StringRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle

@Composable
private fun BaseText(
    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle(),
    @StringRes text: Int,
) {
    Text(
        modifier = modifier,
        style = style,
        text = stringResource(text)
    )
}

@Composable
fun BodyText1(
    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle(),
    @StringRes text: Int,
) {
    BaseText(
        modifier = modifier,
        style = style,
        text = text,
    )
}