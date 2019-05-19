package com.pmar.kotlinlab.projecteuler

class Problem1: Problem<Int>() {

    override fun getProblemId() = 1

    override fun getProblemDesc() =
        """
            If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
            Find the sum of all the multiples of 3 or 5 below 1000.
        """.trimIndent()

    override fun solve(): Int {
        var result = 0
        for(i in 1 until 1_000) {
            if(i % 3 == 0 || i % 5 == 0) {
                result += i
            }
        }

        return result
    }
}