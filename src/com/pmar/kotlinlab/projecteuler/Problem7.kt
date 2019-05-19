package com.pmar.kotlinlab.projecteuler

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
class Problem7 : Problem<Long>() {
    override fun getProblemId() = 7

    override fun getProblemDesc() =
        """
        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        What is the 10 001st prime number?
    """.trimIndent()

    override fun solve(): Long {
        var counter = 0
        for (i in 2L..Long.MAX_VALUE) {
            if (isPrime(i)) {
                counter++
                println("#$counter = $i")
            }
            if (counter == 10_001) {
                return i
            }
        }
        throw ProjectEulerException("Cannot solve ${toString()}")
    }
}