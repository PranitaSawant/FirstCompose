package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Text(text = "Hello My First Project")
            DefaultPreview()
        }
    }
}


@Composable
fun Greeting(name: String) {
    /*Text(text = "Hello $name!",
        color = Color.Gray,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.Center,
        fontSize = 36.sp
   )*/
    Image(painter = painterResource(id = R.drawable.baseline_coffee_24),
        contentDescription = "$name",
        colorFilter = ColorFilter.tint(Color.Black),
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true, name = "First Message",showSystemUi = true)
@Composable
fun DefaultPreview() {
    FirstComposeTheme {
        Greeting("Pranita")
    }
}