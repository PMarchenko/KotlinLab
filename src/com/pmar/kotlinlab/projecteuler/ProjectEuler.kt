package com.pmar.kotlinlab.projecteuler

val problems = listOf(
    Problem1(),
    Problem2(),
    Problem3(),
    Problem4(),
    Problem5()
)

fun main(args: Array<String>) {
    problems.last().resolve()
}