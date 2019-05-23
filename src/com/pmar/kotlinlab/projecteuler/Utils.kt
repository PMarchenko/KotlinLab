package com.pmar.kotlinlab.projecteuler

import java.util.*

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
fun factorize(number: Long): TreeSet<Long> {
    var input = number
    val output = sortedSetOf(1L, number)

    while (input > 1L) {
        for (i in 2L..input) {
            if (input % i == 0L) {
                output.add(i)
                input /= i
                break
            }
        }
    }

    return output
}

fun isPrime(number: Long): Boolean {
    if(number == 1L) return false
    for (factor in 2L..Math.sqrt(number.toDouble()).toLong()) {
        if (number % factor == 0L) return false
    }
    return true
}

fun Long.isPalindrome(): Boolean {
    val string = toString()
    var startIndex = 0
    var endIndex = string.length - 1
    while (startIndex < endIndex) {
        if (string[startIndex] != string[endIndex]) return false
        startIndex++
        endIndex--
    }
    return true
}
