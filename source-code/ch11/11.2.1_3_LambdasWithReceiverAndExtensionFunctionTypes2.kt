package ch11.ex2_1_3_LambdasWithReceiverAndExtensionFunctionTypes2

val appendExcl : StringBuilder.() -> Unit =
        { this.append("!") }

fun main(args: Array<String>) {
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl()
    println(stringBuilder)
    println(buildString(appendExcl))
}
