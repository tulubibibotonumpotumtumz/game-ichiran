package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.test.ui.theme.TestTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayCardPreview()
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from : String, modifier: Modifier = Modifier) {
    Column (modifier = modifier) {
        Text(
            text = message,
            fontSize = 36.sp
        )
        Text(
            text = from,
            fontSize = 24.sp
        )
    }

}
@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.super_mario_bros)
    Image(
        painter = image,
        contentDescription = null
    )
}

@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview(){
    TestTheme{
        BirthdayGreetingWithImage(message = "Super Mario Bros.", from = "-Nintendo")
    }
}

