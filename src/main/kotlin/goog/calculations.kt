package com.famerates.goog

import java.util.Scanner

fun elasticityValues() {
    val scanner = Scanner(System.`in`)

    println("Choose elasticity type (1 for Demand, 2 for Supply):")
    val choice = scanner.nextInt()

    println("Enter initial quantity:")
    val initialQuantity = scanner.nextDouble()

    println("Enter new quantity:")
    val newQuantity = scanner.nextDouble()

    println("Enter initial price:")
    val initialPrice = scanner.nextDouble()

    println("Enter new price:")
    val newPrice = scanner.nextDouble()

    val elasticity = if (choice == 1) {
        calculateElasticity(initialQuantity, newQuantity, initialPrice, newPrice)
    } else {
        calculateElasticity(initialQuantity, newQuantity, initialPrice, newPrice)
    }

    val elasticityType = if (choice == 1) "demand" else "supply"
    println("The price elasticity of $elasticityType is: $elasticity")
}

fun calculateElasticity(initialQuantity: Double, newQuantity: Double, initialPrice: Double, newPrice: Double): Double {
    val deltaQuantity = newQuantity - initialQuantity
    val deltaPrice = newPrice - initialPrice

    val percentChangeQuantity = deltaQuantity / initialQuantity
    val percentChangePrice = deltaPrice / initialPrice

    return percentChangeQuantity / percentChangePrice
}