package com.famerates
import com.famerates.goog.*
import kotlin.system.exitProcess

fun main() {
    println("Which feature would you like to use? [1] Useless things, [2] Pinging, [3] elasticity calculation, [4] would you rather, [5] skyblock or not?")
    val inputA = readln()
    val inputC = inputA.toIntOrNull()
    when (inputC) {
        1 -> {
            useless()
        }
        2 -> {
            pinging()
        }
        3 -> {
            elasticityValues()
        }
        4 -> {
            unlimitedBacon()
        }
        5 -> {
            skyblockOrNot()
        }
        else -> {
            println("unknown option: $inputA")
        }
    }
    exitProcess(status = 0)
}