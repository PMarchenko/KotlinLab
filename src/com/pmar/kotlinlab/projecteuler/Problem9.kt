package com.pmar.kotlinlab.projecteuler

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
class Problem9 : Problem<Int>() {
    override fun getProblemId() = 9

    override fun getProblemDesc() =
        """
            A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
                a2 + b2 = c2
                For example, 32 + 42 = 9 + 16 = 25 = 52.

            There exists exactly one Pythagorean triplet for which a + b + c = 1000.
            Find the product abc.
        """.trimIndent()

    override fun solve(): Int {
        val sum = 12
        for (a in sum - 2 downTo 1) {
            val ab = sum - a
            for (b in ab downTo 1) {
                val c = ab - b
                if (c * c == a * a + b * b) {
                    println("$a and $b and $c")
//                    return a * b * c
                }
            }
        }
        throw ProjectEulerException("Cannot solve ${toString()}")
    }
}