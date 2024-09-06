package com.famerates.goog

import java.io.BufferedReader
import java.io.InputStreamReader


fun pinging() {
    val rt = Runtime.getRuntime()

    val os = System.getProperty("os.name")

    val optionalargs = "-c 5"

    println("What ip/address would you like to ping?")
    val optionalip = readln()
    if (os.contains("windows", ignoreCase = true)) {
        val commands = arrayOf("ping", optionalip)
        val proc = rt.exec(commands)
        val stdInput = BufferedReader(InputStreamReader(proc.inputStream))
        val stdError = BufferedReader(InputStreamReader(proc.errorStream))
        val aerial = commands.contentToString()
        println("Here is the standard output of the command [command, arguments, ip/address] $aerial:\n")
        var s: String? = null
        while ((stdInput.readLine().also { s = it }) != null) {
            println(s)
        }
        println("Here is the standard error of the command (if any):\n")
        while ((stdError.readLine().also { s = it }) != null) {
            println(s)
        }
    }
    else {
        val commands = arrayOf("ping", optionalargs, optionalip)
        val proc = rt.exec(commands)
        val stdInput = BufferedReader(InputStreamReader(proc.inputStream))
        val stdError = BufferedReader(InputStreamReader(proc.errorStream))
        val aerial = commands.contentToString()
        println("Here is the standard output of the command [command, arguments, ip/address] $aerial:\n")
        var s: String? = null
        while ((stdInput.readLine().also { s = it }) != null) {
            println(s)
        }
        println("Here is the standard error of the command (if any):\n")
        while ((stdError.readLine().also { s = it }) != null) {
            println(s)
        }
    }
}