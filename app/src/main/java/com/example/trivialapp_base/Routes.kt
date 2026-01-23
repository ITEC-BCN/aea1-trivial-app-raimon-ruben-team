package com.example.trivialapp_base

sealed class Routes(val route: String) {
    object Game:Routes("game")
    object Menu:Routes("menu")
    object Result:Routes("result")
    object Splash:Routes("splash")
}