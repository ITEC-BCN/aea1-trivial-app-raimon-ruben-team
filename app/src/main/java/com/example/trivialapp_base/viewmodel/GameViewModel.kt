package com.example.trivialapp_base.viewmodel

import android.os.CountDownTimer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.model.ProveedorPreguntas

class GameViewModel : ViewModel() {
    private var preguntasPartida: List<Pregunta> = emptyList()
    var indicePreguntaActual by mutableIntStateOf(0)
        private set

    var preguntaActual by mutableStateOf<Pregunta?>(null)
        private set

    var respuestasMezcladas by mutableStateOf<List<String>>(emptyList())
        private set

    var puntuacion by mutableIntStateOf(0)
        private set

    var tiempoRestante by mutableFloatStateOf(100f)
        private set

    var juegoTerminado by mutableStateOf(false)
        private set

    var dificultadSeleccionada by mutableStateOf("Easy")
        private set

    private var timer: CountDownTimer? = null
    private val TIEMPO_POR_PREGUNTA = 10000L // 10 segons

    fun setDificultad(dificultad: String) {
        dificultadSeleccionada = dificultad // Sense .value!
    }
    fun iniciarJuego() {
        preguntasPartida = ProveedorPreguntas.obtenerPreguntas()
            .filter{ it.dificultad == dificultadSeleccionada }
            .shuffled()
            .take(5)
        indicePreguntaActual = 0
        puntuacion = 0
        juegoTerminado = false
        cargarSiguientePregunta()
    }

    private fun cargarSiguientePregunta() {
        preguntaActual = preguntasPartida[indicePreguntaActual]
        respuestasMezcladas = listOf(
            preguntaActual!!.respuesta1,
            preguntaActual!!.respuesta2,
            preguntaActual!!.respuesta3,
            preguntaActual!!.respuesta4
        ).shuffled()

    }

    fun responderPregunta(respuestaUsuario: String) {
        if (respuestaUsuario == preguntaActual!!.respuestaCorrecta){
            puntuacion++
        }

        if (indicePreguntaActual < preguntasPartida.size - 1){
            avanzarRonda()
            cargarSiguientePregunta()
        }
        else{
            juegoTerminado = true
        }

    }

    private fun avanzarRonda() {
        indicePreguntaActual++
    }

    private fun iniciarTimer() {
            timer?.cancel()
            timer = object : CountDownTimer(TIEMPO_POR_PREGUNTA, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    // Actualitzem l'estat directament
                    tiempoRestante = millisUntilFinished.toFloat() / TIEMPO_POR_PREGUNTA
                }

                override fun onFinish() {
                    tiempoRestante = 0f
                    //
                }
            }.start()
        }

        override fun onCleared() {
            super.onCleared()
            timer?.cancel()
        }
    }


