package com.famerates
import com.famerates.goog.*
import kotlin.system.exitProcess

fun main() {
    println("Which feature would you like to use? (type 'help' for feature list): ")
    val inputA = readln().lowercase()
    when (inputA) {
        "useless" -> uselessThings()
        "ping" -> pinging()
        "elasticity" -> elasticityValues()
        "bacon" -> unlimitedBacon()
        "coinflip" -> coinFlip()
        "math" -> mathQuiz()
        "help" -> featureList()
        "exit", -> exitProcess(status = 0)
        else -> println("unknown option: $inputA")
    }
    return main()
}