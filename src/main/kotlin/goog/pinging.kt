package com.famerates.goog

import java.io.BufferedReader
import java.io.InputStreamReader


fun pinging() {
    val rt = Runtime.getRuntime()
    println("What ip/address would you like to ping?")
    val optionalip = readln()
    val commands = arrayOf("ping", "-c 5", optionalip)
    val proc = rt.exec(commands)

    val stdInput = BufferedReader(InputStreamReader(proc.inputStream))

    val stdError = BufferedReader(InputStreamReader(proc.errorStream))


// Read the output from the command
    val aerial = commands.contentToString()
    println("Here is the standard output of the command [command, arguments, ip/address] $aerial:\n")
    var s: String? = null
    while ((stdInput.readLine().also { s = it }) != null) {
        println(s)
    }


// Read any errors from the attempted command
    println("Here is the standard error of the command (if any):\n")
    while ((stdError.readLine().also { s = it }) != null) {
        println(s)
    }
}