package br.senai.sp.jandira.paginalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.paginalogin.ui.theme.PaginaLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaginaLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
    ) {
      Text(text = "Login",
          fontSize = 55.sp,
          fontWeight = FontWeight.ExtraBold,
          color = Color(0xFFC007DF),
          modifier = Modifier
              .padding(vertical = 180.dp)
      )
        Text(text = "Please sign in to continue.",
            color = Color(0xFFA09A9A),
            modifier = Modifier
                .offset(x = 0.dp, y = -183.dp)
            )
        //era pra ser os detalhes da tela
        Row (modifier = Modifier
            .background(color = Color(0xffc007df)
                )
        ){
            Card (modifier = Modifier
                .width(200.dp)
                .background(color = Color(0xffc007df)))
            {
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    PaginaLoginTheme {
        Greeting("Android")
    }
}