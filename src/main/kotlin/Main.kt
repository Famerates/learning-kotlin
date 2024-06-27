package com.famerates
import com.famerates.goog.elasticityValues
import com.famerates.goog.useless
import com.famerates.goog.pinging
import kotlin.system.exitProcess
import com.famerates.goog.idleGame
import com.famerates.goog.jimmy

fun main() {
    println("Which feature would you like to use? [1] Useless things, [2] Pinging, [3] elasticity calculation, [4] idle game, [5] jimmy")
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
        idleGame()
    }
    else if (inputC == 5) {
        jimmy()
    }
    else {
        println("unknown option: $inputA")
    }
    exitProcess(status = 0)
}