package com.famerates
import com.famerates.goog.*
import kotlin.system.exitProcess

fun main() {
    println("Which feature would you like to use? [1] Useless things, [2] Pinging, [3] elasticity calculation, [4] would you rather, [5] skyblock or not?")
    val inputA = readln()
    val inputC = inputA.toIntOrNull()
    if (inputC == 1) {
        useless()
    }
    else if (inputC == 2) {
        pinging()
    }
    else if (inputC == 3) {
        elasticityValues()
    }
    else if (inputC == 4) {
        unlimitedBacon()
    }
    else if (inputC == 5) {
        skyblockOrNot()
    }
    else {
        println("unknown option: $inputA")
    }
    exitProcess(status = 0)
}