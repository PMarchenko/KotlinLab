package com.pmar.kotlinlab.projecteuler

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
class Problem10 : Problem<Long>() {
    override fun getProblemId() = 10

    override fun getProblemDesc() =
        """
           The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
            Find the sum of all the primes below two million.
        """.trimIndent()

    override fun solve(): Long {
        var result = 0L
        for (i in 1L until 2_000_000L) {
            if (isPrime(i)) {
                result += i
            }
        }
        return result

    }
}