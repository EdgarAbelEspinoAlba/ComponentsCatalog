package com.example.jetpackcomponentscatalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomponentscatalog.ui.theme.JetpackcomponentscatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomponentscatalogTheme {
                // A surface container using the 'background'
                // color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyText()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackcomponentscatalogTheme {
        MyText()
    }
}

@Composable
fun MyText() {
    Column(
        Modifier.fillMaxSize()
    ) {
        Text(text = "Esto es un ejemplo")
        Text(
            text = "Esto es un ejemplo",
            color = Color.Blue
        )
        Text(
            text = "Esto es un ejemplo",
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = "Esto es un ejemplo",
            fontWeight = FontWeight.Light
        )
        Text(
            text = "Esto es un ejemplo",
            style = TextStyle(
                fontFamily = FontFamily.Cursive
            )
        )
        Text(
            text = "Esto es un ejemplo",
            style = TextStyle(
                textDecoration = TextDecoration.LineThrough
            )
        )
        Text(
            text = "Esto es un ejemplo",
            style = TextStyle(
                textDecoration = TextDecoration.Underline
            )
        )
        Text(
            text = "Esto es un ejemplo",
            style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(
                        TextDecoration.LineThrough,
                        TextDecoration.Underline
                    )
                )
            )
        )
        Text(
            text = "Esto es un ejemplo",
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.LineThrough,
                    TextDecoration.Underline
                )
            ),
            fontSize = 30.sp
        )
    }
}