package com.sebast.creational.behavioral.template

open class ConcreteClassA(private val nSteps: Int) : AbstractClass() {
    override fun partition(lowerBoundary: Double, upperBoundary: Double): DoubleArray {
        val partition = DoubleArray(nSteps + 1)
        val amplitude = (upperBoundary - lowerBoundary) / nSteps
        var point = lowerBoundary
        var place = 0
        while (point < upperBoundary) {
            partition[place] = point
            point += amplitude
            place++
        }
        partition[place] = upperBoundary
        return partition
    }

    override fun integrateNumerically(partition: DoubleArray): Double {
        val step = partition[1] - partition[0]
        return (0 until partition.size).sumByDouble {
            (partition[it] * partition[it] + partition[it + 1] * partition[it + 1] * step / 2)
        }
    }
}