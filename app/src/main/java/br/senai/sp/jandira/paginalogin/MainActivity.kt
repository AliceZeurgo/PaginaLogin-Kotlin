package br.senai.sp.jandira.paginalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
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
                    PrimeiraTela()
                }
            }
        }
    }
}

@Composable
fun PrimeiraTela(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp)
                .width(10.dp),
            horizontalArrangement = Arrangement.End

        ){
            Box (
                modifier = Modifier
                    .width(150.dp)
                    .height(350.dp)
                    .offset(y = -15.dp, x = 20.dp)
                    .background(
                        color = Color(0xffc007df),
                        shape = RoundedCornerShape(100.dp),
                    )
            ) {
            }
        }
        Text(
            text = "Login",
            fontSize = 55.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFFC007DF),
            modifier = Modifier
                .padding(vertical = 180.dp)
        )
        Text(
            text = "Please sign in to continue.",
            color = Color(0xFFA09A9A),
            modifier = Modifier
                .offset(x = 0.dp, y = -183.dp)
        )
        //era pra ser os detalhes da tela
        Row(
            modifier = Modifier
                .background(
                    color = Color(0xffc007df)
                )
        ) {
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .background(color = Color(0xffc007df))
            )
            {
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = -100.dp)
                .height(200.dp),
            //.background(Color(0xFFFFA5C4))
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly


        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "E-mail")
                },
                leadingIcon = {

                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffCF06F0),
                        unfocusedBorderColor = Color(0xffCF06F0),
                    ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .width(327.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Password")
                },

                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffCF06F0),
                        unfocusedBorderColor = Color(0xffCF06F0)
                    ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .width(327.dp)
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .width(10.dp),
            horizontalArrangement = Arrangement.End

        ){
            Box (
                modifier = Modifier
                    .width(190.dp)
                    .height(390.dp)
                    .offset(y = 15.dp, x = -267.dp)
                    .background(
                        color = Color(0xffc007df),
                        shape = RoundedCornerShape(20.dp),
                    )
            ) {
            }
        }
    }
}

@Composable
fun TelaSp() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(150.dp)
                        .background(
                            color = Color(0xFFCF06F0),
                            shape = RoundedCornerShape(
                                bottomStart = 16.dp
                            )
                        )
                )
            }

            Column(
                modifier = Modifier
                    .offset(y = -20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Login",
                    fontSize = 50.sp,
                    color = Color(0xFFCF06F0),
                    fontWeight = FontWeight.ExtraBold,
                )
                Text(
                    text = "Please sign in to continue.",
                    fontSize = 14.sp,
                    color = Color.Gray,
                )

                Card(
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(Color(0xfff5f5f8)),
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .width(100.dp)
                        .height(100.dp)
                        .border(
                            width = 1.dp,
                            color = Color(0xFFCF06F0),
                            shape = RoundedCornerShape(100.dp),
                        )

                ) {
                    Image(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(60.dp)
                            .offset(y = 10.dp),


                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "Imagem de um homem sorrindo",
                        contentScale = ContentScale.Crop,


                        )

                }

                Image(
                    painterResource(
                        id = R.drawable.cameraaa),
                    contentDescription = "",
                    modifier = Modifier
                        .offset(y = -20.dp, x = 35.dp)
                        .width(100.dp)
                        .height(20.dp)
                )

            }
            Column(
                modifier = Modifier
                    .width(350.dp)
                    .offset(y = -60.dp)
            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.user),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)

                            )
                            Text(
                                text = "  Username",
                                color = Color.Black
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 20.dp
                        )
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.celular),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)


                            )
                            Text(
                                text = "  Phone",
                                color = Color.Black
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 10.dp
                        )
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.email1),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)

                            )
                            Text(
                                text = "  Email",
                                color = Color.Black
                            )
                        }

                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 10.dp
                        )
                        .fillMaxWidth()
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.lock),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)


                            )
                            Text(
                                text = "  Password",
                                color = Color.Black
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 10.dp
                        )
                        .fillMaxWidth()
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = false,
                        onCheckedChange = {},
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFFCF06F0),
                            uncheckedColor = Color(0xFFCF06F0)
                        )
                    )
                    Text(text = "Over 18?")
                }

                Button(
                    modifier = Modifier
                        .fillMaxWidth(),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xFFCF06F0)
                        ),
                    shape = RoundedCornerShape(
                        12.dp
                    )

                ) {
                    Text(
                        text = "CREATE ACCOUNT",
                        fontSize = 18.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold
                    )

                }

                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "SIGN IN   ",
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = "Already have an account? ",
                            fontSize = 13.sp,
                            color = Color.Gray,
                        )
                        Text(
                            text = "Sign in",
                            fontSize = 13.sp,
                            color = Color(0xFFCF06F0),
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }


            }

        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
                    .background(
                        color = Color(0xFFCF06F0),
                        shape = RoundedCornerShape(
                            topEnd = 16.dp
                        )
                    )
            )
        }
    }
}







@Composable
fun Tela3(){

    Column {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp)
                .width(10.dp),
                horizontalArrangement = Arrangement.End

        ){

        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = -45.dp)
                .height(200.dp),
            shape = RoundedCornerShape(0.dp)

        ) {
            Image(
                painterResource(id = R.drawable.paris),
                modifier = Modifier
                    .fillMaxWidth(),
                contentDescription = "Torre",
                contentScale = ContentScale.Crop,

            )
        }
        Column (
            modifier = Modifier
                .padding(20.dp)
        ){
            Row {
                Text(text = "You're in Paris",
                    modifier = Modifier
                        .offset(y = -115.dp)
                    ,
                    fontSize = 15.sp,
                    color = Color(0xFFFFFFFF,
                        )
                )


            }
            Text(text = "My Trips",
                modifier = Modifier
                    .offset(y = -120.dp)

                ,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 23.sp,
                color = Color(0xFFFFFFFF,
                )
            )
        }

        Row {

            Text(text = "Categories",
                color = Color(0xFF3A3636),
                modifier = Modifier
                    .offset(y = -147.dp)
                    .padding(20.dp)
                )




        }

        Spacer(modifier = Modifier.height(100.dp))
        LazyRow (
            modifier = Modifier
                .offset(y = -260.dp)
        ){
            items(3){
                Card(
                    modifier = Modifier
                        .width(140.dp)
                        .height(96.dp)
                        .offset(y = 20.dp)

                        .padding(end = 8.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFCF06F0)
                        ),
                    border = BorderStroke(width = 2.dp,
                        brush = Brush.horizontalGradient(listOf(Color(0x52413C47), Color(0x7738314B)
                        )))
                ) {
                    Row (modifier = Modifier.fillMaxSize(),

                    ){
                        Card{
                            Image(painter = painterResource(id = R.drawable.montanha),
                                contentDescription = "",
                                Modifier
                                    .size(50.dp)
                                    .background(color = Color(0xFFCF06F0))
                            )
                        }
                        Row (
                            modifier = Modifier.align(Alignment.CenterVertically)
                        ){
                            Text(
                                text = "Montain",
                                fontSize = 20.sp,
                                modifier = Modifier
                                    .align(alignment = Alignment.CenterVertically),
                                color = Color(0xFFCAB6E7,
                                    )
                            )
                        }
                    }
                }
            }
        }

    }
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    PaginaLoginTheme {
        PrimeiraTela()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Tela2Preview() {
    PaginaLoginTheme {
        TelaSp()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Tela3Preview() {
    PaginaLoginTheme {
        Tela3()
    }
}


