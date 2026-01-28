package com.example.trivialapp_base.view

import android.R.attr.fontWeight
import android.R.attr.text
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.viewmodel.GameViewModel
import com.example.trivialapp_base.ui.theme.Verde

@Composable
fun MenuScreen(navController: NavController, viewModel: GameViewModel) {
    Box(
        modifier = Modifier.fillMaxSize().background(color = Verde)) {
        Column(modifier = Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Trivial Porsuit", fontSize = 32.sp, fontWeight = FontWeight.Bold)

            Image(
                painter = painterResource(id = R.drawable.trivialimg),
                contentDescription = "Logo",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Crop
            )
            BotonDesplegable(viewModel)
            Button(
                onClick = {
                    viewModel.iniciarJuego()
                    navController.navigate(Routes.Game.route)
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )


            ) {
                Text(text = "New Game")
            }


        }
    }
}
@Composable
fun BotonDesplegable(viewModel: GameViewModel) {
    var expanded by remember { mutableStateOf(false)}
    Box {

        Button(
            onClick = { expanded = true },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )


        ) {
            Text("Difficulty: ${viewModel.dificultadSeleccionada}")
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false},
            modifier = Modifier.background(Color.White)
        ) {
            DropdownMenuItem(
                text = { Text("Easy") },
                onClick = {
                    viewModel.setDificultad("Easy")
                    expanded = false
                }
            )

            DropdownMenuItem(
                text = { Text("Medium") },
                onClick = {
                    viewModel.setDificultad("Medium")
                    expanded = false
                }
            )

            DropdownMenuItem(
                text = { Text("Hard") },
                onClick = {
                    viewModel.setDificultad("Hard")
                    expanded = false
                }
            )
        }
    }
}