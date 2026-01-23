package com.example.trivialapp_base.model

// Definición de la clase de datos Pregunta según requisitos
data class Pregunta(
    val pregunta: String,
    val categoria: String,
    val dificultad: String, // "Facil", "Medio", "Dificil"
    val respuesta1: String,
    val respuesta2: String,
    val respuesta3: String,
    val respuesta4: String,
    val respuestaCorrecta: String // Debe coincidir con una de las anteriores
)

// Objeto para simular la base de datos local (Hardcoded)
object ProveedorPreguntas {
    fun obtenerPreguntas(): MutableList<Pregunta> {
        return mutableListOf(
            Pregunta("¿Cuál es el planeta más cercano al Sol?", "Ciencia", "Easy", "Venus", "Marte", "Mercurio", "Júpiter", "Mercurio"),
            Pregunta("¿Cuántos continentes hay en la Tierra?", "Geografía", "Easy", "5", "6", "7", "8", "7"),
            Pregunta("¿Cuál de estos animales es un mamífero?", "Ciencia", "Easy", "Tiburón", "Pulpo", "Delfín", "Pingüino", "Delfín"),
            Pregunta("¿Cuál es la capital de España?", "Geografía", "Easy", "Barcelona", "Sevilla", "Valencia", "Madrid", "Madrid"),
            Pregunta("¿Qué sentido usamos para oír sonidos?", "Ciencia", "Easy", "Vista", "Oído", "Tacto", "Gusto", "Oído"),
            Pregunta("¿Qué órgano del cuerpo humano se encarga de la respiración?", "Ciencia", "Medium", "Corazón", "Pulmones", "Riñones", "Estómago", "Pulmones"),
            Pregunta("¿Qué tipo de energía utiliza el Sol?", "Ciencia", "Medium", "Eléctrica", "Nuclear", "Mecánica", "Química", "Nuclear"),
            Pregunta("¿En qué continente se encuentra el río Amazonas?", "Geografía", "Medium", "África", "Asia", "Europa", "América", "América"),
            Pregunta("¿Quién fue el primer presidente de Estados Unidos?", "Historia", "Medium", "Abraham Lincoln", "George Washington", "Thomas Jefferson", "Benjamin Franklin", "George Washington"),
            Pregunta("¿Qué figura geométrica tiene todos sus lados iguales?", "Matemáticas", "Medium", "Rectángulo", "Rombo", "Cuadrado", "Trapecio", "Cuadrado"),
            Pregunta("¿Qué gas necesitan las plantas para hacer la fotosíntesis?", "Ciencia", "Hard", "Oxígeno", "Nitrógeno", "Dióxido de carbono", "Hidrógeno", "Dióxido de carbono"),
            Pregunta("¿Qué instrumento se utiliza para medir la temperatura?", "Ciencia", "Hard", "Barómetro", "Termómetro", "Anemómetro", "Higrómetro", "Termómetro"),
            Pregunta("¿Qué civilización construyó las pirámides de Giza?", "Historia", "Hard", "Romana", "Griega", "Egipcia", "Mesopotámica", "Egipcia"),
            Pregunta("¿Qué parte del cerebro controla el equilibrio?", "Ciencia", "Hard", "Cerebro", "Cerebelo", "Hipotálamo", "Médula espinal", "Cerebelo"),
            Pregunta("¿Qué tipo de roca se forma a partir del magma?", "Ciencia", "Hard", "Sedimentaria", "Metamórfica", "Ígnea", "Calcárea", "Ígnea")
        )
    }
}