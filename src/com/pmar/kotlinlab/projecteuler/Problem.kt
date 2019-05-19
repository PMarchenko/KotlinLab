package com.pmar.kotlinlab.projecteuler
abstract class Problem<T> {

    protected abstract fun getProblemId(): Int

    protected abstract fun getProblemDesc(): String

    protected abstract fun solve(): T

    fun resolve() {
        val start = System.nanoTime()

        val result = solve()

        val end = System.nanoTime()
        val duration = end - start

        println("${toString()} = $result\t(solved in ${duration/1e6}ms)")
    }

    override fun toString(): String {
        return "Problem #${getProblemId()}"
    }
}