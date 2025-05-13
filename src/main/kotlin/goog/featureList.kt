package com.famerates.goog

import com.famerates.main

data class HelpItem(val command: String, val explanation: String)

fun featureList() {
    val helpList = arrayListOf(
        HelpItem("useless", "prints useless stuff to the terminal"),
        HelpItem("ping", "pinging feature"),
        HelpItem("elasticity", "elasticity calculation"),
        HelpItem("bacon", "bacon question"),
        HelpItem("coinflip", "whether you should play skyblock or not"),
        HelpItem("math", "math quiz")
    )
    val maxCommandLength = helpList.maxOfOrNull { it.command.length } ?: 0
    val spacing = 3
    for (item in helpList) {
        val paddingLength = maxCommandLength - item.command.length + spacing
        val padding = " ".repeat(paddingLength)
        println("${item.command}$padding${item.explanation}")
    }
    return main()
}