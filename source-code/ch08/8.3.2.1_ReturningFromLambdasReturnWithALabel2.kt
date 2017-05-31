package ch08.ex3_2_1_ReturningFromLambdasReturnWithALabel2

fun main(args: Array<String>) {
    println(StringBuilder().apply sb@{
       listOf(1, 2, 3).apply {
           this@sb.append(this.toString())
       }
    })
}
