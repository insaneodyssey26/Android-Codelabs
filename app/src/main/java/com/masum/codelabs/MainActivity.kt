package com.masum.codelabs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                GoodLuck(
                    message = "Good Luck Saheli for your future",
                    from  = "From Masum",
                )
            }
        }
    }
}

@Composable
fun GoodLuck (message: String, from: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = message,
            fontSize = 60.sp,
            lineHeight = 100.sp,
            modifier = modifier.padding(67.dp),
        )
        Text(
            text = from,
            fontSize = 30.sp,
            modifier = modifier.padding(80.dp)
        )
    }
}
@Preview (showBackground = true)
@Composable
fun GoodLuckPreview() {
    CodelabsTheme {
        GoodLuck(message = "Good Luck Saheli for your future", from  = "From Masum")
    }
}
