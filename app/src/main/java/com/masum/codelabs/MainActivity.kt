package com.masum.codelabs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.masum.codelabs.ui.theme.CodelabsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodelabsTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GoodLuck(
                        message = "Good Luck Saheli for your future",
                        from = "From Masum",
                    )
                }
            }
        }
    }
}

@Composable
fun GoodLuck (message: String, from: String, modifier: Modifier = Modifier) {
    Column{
        val image = painterResource(R.drawable.usghibli)  // Image resource ekhane use hoyeche
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = message,
            fontSize = 60.sp,
            lineHeight = 100.sp,
            modifier = Modifier.padding(67.dp),
            textAlign = TextAlign.Center,
        )
        Text(
            text = from,
            fontSize = 30.sp,
            modifier = Modifier.padding(20.dp)
                .align(Alignment.End),
        )
    }
}
@Preview (showBackground = true)
@Composable
fun GoodLuckPreview() {
    CodelabsTheme {
        GoodLuckImage(
            message = "Good Luck Saheli for your future",
            from = "From Masum"
        )
    }
}

@Composable
fun GoodLuckImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.usghibli)
    Image(
        modifier = modifier.fillMaxSize(),
        painter = image,
        contentDescription = null,
    )
}
