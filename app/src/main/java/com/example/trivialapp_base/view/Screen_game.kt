package com.example.trivialapp_base.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Yellow)) {
        Column(modifier = Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally)
        {
        Text(text = "Round",)
        Text(text = "Question 1: ")
            Row{
                Button(
                    onClick = {navController.navigate(Routes.Result.route)},
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )

                ) {
                    Text(text = "New Game")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = {navController.navigate(Routes.Result.route)},
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )

                ) {
                    Text(text = "New Game")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row{
                Button(
                    onClick = {navController.navigate(Routes.Result.route)},
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )

                ) {
                    Text(text = "New Game")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = {navController.navigate(Routes.Result.route)},
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
    }