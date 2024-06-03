package com.famerates
import com.famerates.goog.elasticityValues
import com.famerates.goog.perunantti
import com.famerates.goog.pinging
import kotlin.system.exitProcess


fun main() {
    println("Which feature would you like to use? [1] Perunantti, [2] Pinging, [3] elasticity calculation")
    val kakkeli = readln().toIntOrNull()
    if (kakkeli == 1) {
        perunantti()
    }
    if (kakkeli == 2) {
        pinging()
    }
    if (kakkeli == 3) {
        elasticityValues()
    }
    else {
        exitProcess(status = 1)
    }
    exitProcess(status = 0)
}