package com.famerates.goog

fun coinFlip(){
    val status: String?
    val possibleValues = arrayOf("heads", "tails")
    val determine = (0..1).random()

    val setStatus = possibleValues[determine]
    status = setStatus
    println(status)
}