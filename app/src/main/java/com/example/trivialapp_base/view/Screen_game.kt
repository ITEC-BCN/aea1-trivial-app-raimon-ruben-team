package com.example.trivialapp_base.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.ui.theme.Crema
import com.example.trivialapp_base.ui.theme.Verde
import com.example.trivialapp_base.ui.theme.teal_200
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Verde)) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )

        {
            Image(
                painter = painterResource(id = R.drawable.trivialimg),
                contentDescription = "Logo",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(50.dp))
            LinearProgressIndicator(progress = {viewModel.tiempoRestante})
            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = "Round: ${viewModel.indicePreguntaActual + 1}/10",
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(30.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(20.dp),
                shape = MaterialTheme.shapes.small,
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                border = BorderStroke(
                    5.dp,
                    Color.Black
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
            ) {
                Column(
                    Modifier.padding(8.dp)
                ) {
                    Text(
                        text = "Question: ${viewModel.preguntaActual!!.pregunta}",
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
            Row{
                Button(
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[0])
                        if (viewModel.juegoTerminado){
                            navController.navigate(Routes.Result.route)
                        }
                    },
                    Modifier
                        .width(140.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )

                ) {
                    Text(text = viewModel.respuestasMezcladas[0])
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[1])
                        if (viewModel.juegoTerminado){
                            navController.navigate(Routes.Result.route)
                        }
                    },
                    Modifier
                        .width(140.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )

                ) {
                    Text(text = viewModel.respuestasMezcladas[1])
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row{
                Button(
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[2])
                        if (viewModel.juegoTerminado){
                            navController.navigate(Routes.Result.route)
                        }
                    },
                    Modifier
                        .width(140.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )

                ) {
                    Text(text = viewModel.respuestasMezcladas[2])
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[3])
                        if (viewModel.juegoTerminado){
                            navController.navigate(Routes.Result.route)
                        }
                    },
                    Modifier
                        .width(140.dp)
                        .height(40.dp),

                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )

                ) {
                    Text(text = viewModel.respuestasMezcladas[3])
                }
                if (viewModel.juegoTerminado){
                    navController.navigate(Routes.Result.route)
                }
            }
        }


    }
}