package com.pmar.kotlinlab.projecteuler

val problems = listOf(
    Problem1(),
    Problem2(),
    Problem3(),
    Problem4(),
    Problem5(),
    Problem6(),
    Problem7(),
    Problem8(),
    Problem9(),
    Problem10()
)

fun main() {
    problems.last().resolve()
}