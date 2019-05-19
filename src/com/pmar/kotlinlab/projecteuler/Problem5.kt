package com.pmar.kotlinlab.projecteuler

import kotlin.math.max

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
class Problem5 : Problem<Long>() {
    override fun getProblemId() = 5

    override fun getProblemDesc() =
        """
            2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
            What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
        """.trimIndent()

    override fun solve(): Long {
        val divisors = (11L..20L).toList()
        var maxNumber = 1L

        divisors.forEach { maxNumber *= it }
        outerLoop@ for (number in 1L..maxNumber) {
            for (divisor in divisors) {
                if (number % divisor != 0L) {
                    continue@outerLoop
                }
            }
            return number
        }

        throw ProjectEulerException("Cannot solve ${toString()}")
    }
}