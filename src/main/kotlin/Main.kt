package com.famerates
import com.famerates.goog.*
import kotlin.system.exitProcess

fun main() {
    println("Which feature would you like to use? (type 'help' for feature list): ")
    val inputA = readln()
    when (inputA) {
        "useless" -> uselessThings()
        "ping" -> pinging()
        "elasticity" -> elasticityValues()
        "bacon" -> unlimitedBacon()
        "coinflip" -> skyblockOrNot()
        "math" -> mathQuiz()
        "help" -> featureList()
        else -> println("unknown option: $inputA")
    }
    exitProcess(status = 0)
}