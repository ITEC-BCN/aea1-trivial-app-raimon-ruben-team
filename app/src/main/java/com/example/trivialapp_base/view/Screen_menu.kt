package com.example.trivialapp_base.view

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
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun MenuScreen(navController: NavController, viewModel: GameViewModel) {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Green)) {
        Text(
            text = "Pantalla 1",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navController.navigate(Routes.Game.route) })
    }

    @Composable
    fun MenuDificultad() {
        var expanded by remember { mutableStateOf(false) }
        var dificultadSeleccionada by remember { mutableStateOf("Selecciona dificultad") }

        val dificultades = listOf("Fácil", "Medio", "Difícil")

        Column {
            Button(onClick = { expanded = true }) {
                Text(dificultadSeleccionada)
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                dificultades.forEach { dificultad ->
                    DropdownMenuItem(
                        text = { Text(dificultad) },
                        onClick = {
                            dificultadSeleccionada = dificultad
                            expanded = false

                            // Lógica del trivial
                            println("Dificultad seleccionada: ${dificultad.lowercase()}")
                        }
                    )
                }
            }
        }
    }

}