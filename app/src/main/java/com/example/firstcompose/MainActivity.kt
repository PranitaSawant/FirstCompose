package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    /*Image(painter = painterResource(id = R.drawable.baseline_coffee_24),
        contentDescription = "$name",
        colorFilter = ColorFilter.tint(Color.Black),
        contentScale = ContentScale.Crop
    )*/
    /*Button(onClick = {},
    colors = ButtonDefaults.buttonColors(
        contentColor = Color.White,
        backgroundColor = Color.DarkGray
    ), enabled = true) {//to apply changes make it true
        Text(text = "Hello")
        Image(painter = painterResource(id = R.drawable.baseline_coffee_24),
            colorFilter = ColorFilter.tint(Color.White),//to change the color of image
            contentDescription = "Dummy")
    }*/
    TextField(value = "Hello Pranita", onValueChange = {},
        label = { Text(text = "Enter Message") })
}

@Preview(showBackground = true, name = "First Message", showSystemUi = true)
@Composable
fun DefaultPreview() {
    FirstComposeTheme {
        //Greeting("Pranita")
        //TextInput()
        //sampleLayouts()
        //ListViewItem(R.drawable.baseline_co_profile_24,"Pranita Sawant","Developer")
        modifiers()
    }
}

@Composable
fun TextInput() {
    val state = remember { mutableStateOf("") } //use remember to maintain last state
    TextField(
        value = state.value,
        onValueChange = { state.value = it },
        label = { Text(text = "Enter Message") })
}

@Composable
fun sampleLayouts() {

    /*Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A" , fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }

    Row(horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(text = "A" , fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }*/

    /*Box(contentAlignment = Alignment.Center){//simillar to Frame Layout in android
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Background", alignment = Alignment.TopCenter, contentScale = ContentScale.Fit )
        Image(painter = painterResource(id = R.drawable.baseline_coffee_24), contentDescription = "Coffee" )
    }*/

}

@Composable
fun ListViewItem(imgId: Int, name: String, occupation: String) {
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "profile",
            Modifier.size(60.dp)
        )
        Column() {
            Text(text = name, fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)
            Text(text = occupation, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun modifiers() {
    //sequence matters
    Text(
        text = "Pranita",
        textAlign = TextAlign.Center,
        color = Color.Blue,
        modifier = Modifier.clickable {  }
            .background(Color.Magenta)
            .size(150.dp)
            .border(2.dp, Color.Black)
            .clip(CircleShape)
            .background(Color.Yellow)
            .padding(8.dp,20.dp,8.dp,0.dp)
    )
}