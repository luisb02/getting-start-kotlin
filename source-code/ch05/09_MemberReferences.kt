package ch05.MemberReferences

fun salute() = println("Salute!")

fun main(args: Array<String>) {
    run(::salute)
}
