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
            Pregunta("¿Qué gas es más abundante en la atmósfera terrestre?", "Ciencia", "Easy", "Oxígeno", "Dióxido de carbono", "Nitrógeno", "Hidrógeno", "Nitrógeno"),
            Pregunta("¿En qué continente se encuentra el desierto del Gobi?", "Geografía", "Easy", "África", "Europa", "Asia", "Oceanía", "Asia"),
            Pregunta("¿Cuál de estos instrumentos tiene teclas?", "Música", "Easy", "Violín", "Guitarra", "Piano", "Flauta", "Piano"),
            Pregunta("¿Qué tipo de animal es una ballena?", "Ciencia", "Easy", "Pez", "Reptil", "Mamífero", "Anfibio", "Mamífero"),
            Pregunta("¿Qué número romano representa el valor 50?", "Historia", "Easy", "L", "V", "X", "C", "L"),
            Pregunta("¿Qué órgano del cuerpo humano se encarga de la respiración?", "Ciencia", "Medium", "Corazón", "Pulmones", "Riñones", "Estómago", "Pulmones"),
            Pregunta("¿Qué tipo de energía utiliza el Sol?", "Ciencia", "Medium", "Eléctrica", "Nuclear", "Mecánica", "Química", "Nuclear"),
            Pregunta("¿En qué continente se encuentra el río Amazonas?", "Geografía", "Medium", "África", "Asia", "Europa", "América", "América"),
            Pregunta("¿Quién fue el primer presidente de Estados Unidos?", "Historia", "Medium", "Abraham Lincoln", "George Washington", "Thomas Jefferson", "Benjamin Franklin", "George Washington"),
            Pregunta("¿Qué figura geométrica tiene todos sus lados iguales?", "Matemáticas", "Medium", "Rectángulo", "Rombo", "Cuadrado", "Trapecio", "Cuadrado"),
            Pregunta("¿Quién escribió la obra 'La Celestina'?", "Literatura", "Medium", "Miguel de Cervantes", "Fernando de Rojas", "Lope de Vega", "Garcilaso de la Vega", "Fernando de Rojas"),
            Pregunta("¿Qué órgano del cuerpo humano produce la insulina?", "Ciencia", "Medium", "Hígado", "Riñón", "Páncreas", "Estómago", "Páncreas"),
            Pregunta("¿Qué país fue el primero en conceder el voto femenino a nivel nacional?", "Historia", "Medium", "Estados Unidos", "Francia", "Nueva Zelanda", "Reino Unido", "Nueva Zelanda"),
            Pregunta("¿Cuántos lados tiene un dodecágono?", "Matemáticas", "Medium", "10", "11", "12", "8", "12"),
            Pregunta("¿Qué tipo de energía aprovechan los aerogeneradores?", "Tecnología", "Medium", "Solar", "Hidráulica", "Eólica", "Geotérmica", "Eólica"),
            Pregunta("¿Qué gas necesitan las plantas para hacer la fotosíntesis?", "Ciencia", "Hard", "Oxígeno", "Nitrógeno", "Dióxido de carbono", "Hidrógeno", "Dióxido de carbono"),
            Pregunta("¿Qué instrumento se utiliza para medir la temperatura?", "Ciencia", "Hard", "Barómetro", "Termómetro", "Anemómetro", "Higrómetro", "Termómetro"),
            Pregunta("¿Qué civilización construyó las pirámides de Giza?", "Historia", "Hard", "Romana", "Griega", "Egipcia", "Mesopotámica", "Egipcia"),
            Pregunta("¿Qué parte del cerebro controla el equilibrio?", "Ciencia", "Hard", "Cerebro", "Cerebelo", "Hipotálamo", "Médula espinal", "Cerebelo"),
            Pregunta("¿Qué tipo de roca se forma a partir del magma?", "Ciencia", "Hard", "Sedimentaria", "Metamórfica", "Ígnea", "Calcárea", "Ígnea"),
            Pregunta("¿Qué científico formuló las leyes del movimiento planetario antes que Newton?", "Ciencia", "Hard", "Galileo Galilei", "Copérnico", "Kepler", "Einstein", "Kepler"),
            Pregunta("¿En qué año comenzó la Revolución Francesa?", "Historia", "Hard", "1789", "1776", "1812", "1804", "1789"),
            Pregunta("¿Qué figura retórica consiste en atribuir cualidades humanas a objetos o animales?", "Lengua", "Hard", "Hipérbole", "Metáfora", "Personificación", "Anáfora", "Personificación"),
            Pregunta("¿Cuál es la capital de Eslovenia?", "Geografía", "Hard", "Bratislava", "Liubliana", "Zagreb", "Sofía", "Liubliana"),
            Pregunta("¿Qué unidad se utiliza para medir la intensidad de corriente eléctrica?", "Física", "Hard", "Voltio", "Ohmio", "Amperio", "Vatio", "Amperio"),

            )
    }
}