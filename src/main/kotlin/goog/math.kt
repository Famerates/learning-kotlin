package com.famerates.goog
import kotlin.random.Random

fun mathQuiz() {
    // TODO timer
    println("This is a 5 question math quiz")

    repeat(5) {
        val num1 = Random.nextInt(1,10)
        val num2 = Random.nextInt(1,10)
        var num3 = 0
        val symbol = Random.nextInt(1,3)
        var sym = " "
        when (symbol) {
            1 -> {
                sym = "*"
                num3 = num1 * num2
            }
            2 -> {
                sym = "+"
                num3 = num1 + num2
            }
            3 -> {
                sym = "-"
                num3 = num1 - num2
            }
        }
        print("$num1 $sym $num2 = ")
        val input = readln().toIntOrNull()
        if (input == num3) {
            println("Correct")
        } else {
            println("Incorrect")
        }
    }
return
}