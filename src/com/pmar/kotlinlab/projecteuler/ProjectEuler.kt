package com.pmar.kotlinlab.projecteuler

val problems = listOf(
    Problem1(),
    Problem2(),
    Problem3(),
    Problem4()
)

fun main(args: Array<String>) {
    problems.last().resolve()
}