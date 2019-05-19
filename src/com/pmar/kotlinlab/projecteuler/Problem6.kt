package com.pmar.kotlinlab.projecteuler

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
class Problem6 : Problem<Long>() {
    override fun getProblemId() = 6

    override fun getProblemDesc() =
        """
            The sum of the squares of the first ten natural numbers is,
                12 + 22 + ... + 102 = 385
            The square of the sum of the first ten natural numbers is,
                (1 + 2 + ... + 10)2 = 552 = 3025
            Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
            Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
        """.trimIndent()

    override fun solve(): Long {
        var sumOfSquares = 0L
        var sum = 0L
        for(i in 1L..100L) {
            sumOfSquares += i * i
            sum += i
        }
        return sum * sum - sumOfSquares
    }
}