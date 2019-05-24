package com.pmar.kotlinlab.projecteuler

import java.util.*

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
fun Long.factorize(): TreeSet<Long> {
    var input = this
    val output = sortedSetOf(1L, this)

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
    if (number == 1L) return false
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

fun Int.triangleNumber() = this * (this + 1) / 2

fun Long.triangleNumber() = this * (this + 1L) / 2L

fun Long.divisors(): Collection<Long> {
    var ths = this
    val divisors = TreeSet<Long>()

    while (ths > 1) {
        for (i in 2L..ths) {
            if (ths % i == 0L) {
                divisors.addAll(divisors.map { it * i })
                divisors.add(i)
                ths /= i
                break
            }
        }
    }
    divisors.add(1L)
    divisors.add(this)
    return divisors
}
