package com.famerates.goog

fun jimmy(){
    val status: String?
    val possibleLocations = arrayOf("home", "out")
    val determine = (0..1).random()
    var skyblock: Boolean? = null

    val setStatus = possibleLocations[determine]
    status = setStatus
    if (status == "out"){
        skyblock = false
    }
    else if (status == "home"){
        skyblock = true
    }
    println("skyblock=$skyblock")
}