package com.famerates.goog
import java.util.Scanner
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun idleGame() {
    val scanner = Scanner(System.`in`)
    println("Welcome to IDLE GAME v0.0.1!!!")
    println("Enter save name:") // Implement if to check if save exists
    val savename = scanner.next() // Make this name a save somehow
    println("Created save $savename")
    val scheduler = Executors.newSingleThreadScheduledExecutor()

    var money = 0F
    var mps = 1F // money per second
//    var upgrade1 = 0F
//    var upgrade2 = 0F
//    var upgrade3 = 0F

    scheduler.scheduleAtFixedRate({
        money += mps
        print("\r$money")
    }, 0, 1, TimeUnit.SECONDS)

    // money = money + mps
    // (upgrade1) mps = mps + upgrade1
    // (upgrade2) mps = mps * (1 + upgrade2)
    // (upgrade3) mps = mps + (1 + upgrade2 * upgrade1)
    Thread.currentThread().join()
}