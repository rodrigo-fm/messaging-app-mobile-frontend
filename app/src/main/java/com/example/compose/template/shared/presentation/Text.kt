package com.example.compose.template.shared.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
private fun BaseText(
    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle(),
    text: String,
) {
    Text(
        modifier = modifier,
        style = style,
        text = text
    )
}

@Composable
fun Headline1(
    modifier: Modifier = Modifier,
    text: String,
) {
    BaseText(
        modifier = modifier,
        style = TextStyle(
            fontWeight = FontWeight.Black,
            fontSize = 28.sp
        ),
        text = text,
    )
}

@Preview(showBackground = true)
@Composable
private fun Headline1Preview() {
    Headline1(text = "Headline 1")
}