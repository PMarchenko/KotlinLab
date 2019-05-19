package com.pmar.kotlinlab.projecteuler

import java.util.*

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
class Problem4 : Problem<Long>() {
    override fun getProblemId() = 4

    override fun getProblemDesc() =
        """
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.
    """.trimIndent()

    override fun solve(): Long {
        val first = 999L
        val second = 999L
        val palindromes = TreeSet<Long>()
        for (i in first downTo 1) {
            for (j in second downTo i) {
                val ij = i*j
                if(ij.isPalindrome()) palindromes.add(ij)
            }
        }

        return palindromes.last()
    }
}