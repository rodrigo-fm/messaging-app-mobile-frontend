package com.example.compose.template.shared.presentation

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.compose.template.R
import androidx.compose.material3.Button as ComposableButton

@Preview
@Composable
private fun ButtonPreview() = Button(onClick = {}, text = R.string.login)

@Composable
fun Button(
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle(),
    onClick: () -> Unit,
    @StringRes text: Int
) {
    ComposableButton(
        modifier = modifier,
        onClick = onClick,
        content = {
            BodyText1(
                style = textStyle.copy(fontSize = 20.sp),
                text = text
            )
        }
    )
}