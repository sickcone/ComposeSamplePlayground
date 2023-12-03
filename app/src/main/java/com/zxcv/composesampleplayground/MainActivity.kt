package com.zxcv.composesampleplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zxcv.composesampleplayground.ui.theme.ComposeSamplePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxExampleImage()
        }
    }
}

@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .background(color = Color.Yellow)
            .size(350.dp, 450.dp)
    ) {
        Box(
            modifier = Modifier
                .background(color = Color.Green)
                .size(200.dp, 300.dp)
                .align(Alignment.Center)
        ) {
            Text(
                text = "Hello Choto",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .background(
                        color = Color.Blue
                    )
                    .padding(10.dp)
                    .align(Alignment.CenterEnd)
            )
        }
        Text(
            text = "Hello Moto",
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier
                .background(
                    color = Color.Red
                )
                .padding(10.dp)
                .align(Alignment.BottomEnd)
        )
    }
}

@Composable
fun BoxExampleImage() {
    Box {
        Image(painter = painterResource(id = R.drawable.cute), contentDescription = "Omen")
        Text(
            text = "Oh Boi",
            modifier = Modifier
                .background(Color.Red)
                .align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun RowColumnCombo() {
    Column(
        modifier = Modifier
            .background(color = Color.Red)
            .wrapContentHeight(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Greeting("Reeee")
        Row(
            modifier = Modifier
                .background(color = Color.Green),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start
        ) {
            Greeting("Android")
            Greeting("Boys Oh Boys")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
            .border(5.dp, color = Color.Yellow)
            .background(color = Color.Gray)
            .padding(26.dp)
            .wrapContentHeight()
            .wrapContentWidth(),
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Cyan,
        textAlign = TextAlign.Center,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeSamplePlaygroundTheme {
        Greeting("Android")
    }
}