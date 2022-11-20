package com.rangga.rockpaperscissors

import android.graphics.drawable.Drawable
import kotlin.random.Random

object Game {

    fun isDraw(to: String, from: String): Boolean = to == from

    val schema = mapOf(
        "Rock-Scissors" to true,
        "Rock-Paper" to false,
        "Paper-Rock" to true,
        "Paper-Scissors" to false,
        "Scissors-Paper" to true,
        "Scissors-Rock" to false
    )

    fun isWin(to: String, from: String): Boolean = schema["$to-$from"]!!
    val computer = listOf("Rock", "Paper", "Scissors")

    fun computerPick() = computer[Random.nextInt(0, 3)]
}