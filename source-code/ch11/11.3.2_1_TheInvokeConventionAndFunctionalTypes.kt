package ch11.ex3_2_1_TheInvokeConventionAndFunctionalTypes

interface Function2<in P1, in P2, out R> {
    operator fun invoke(p1: P1, p2: P2): R
}
