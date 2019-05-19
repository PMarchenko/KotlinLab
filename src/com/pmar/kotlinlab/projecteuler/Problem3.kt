package com.pmar.kotlinlab.projecteuler

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
class Problem3 : Problem<Long>() {

    override fun getProblemId() = 3

    override fun getProblemDesc() =
        """
        The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?
    """.trimIndent()

    override fun solve(): Long {
        val input = 600851475143L
        factorize(input).descendingIterator().forEach {
            if (isPrime(it)) return@solve it
        }
        throw ProjectEulerException("Cannot solve the problem")
    }
}