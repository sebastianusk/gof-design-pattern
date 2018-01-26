package com.sebast.creational.behavioral.template

abstract class AbstractClass {

    fun doIntegrateParabola(
            lowerBoundary: Double,
            upperBoundary: Double
    ): Double {
        if (!validIntegrationInterval(lowerBoundary, upperBoundary)) {
            throw IllegalArgumentException("Wrong boundaries")
        }

        val partition = partition(lowerBoundary, upperBoundary)
        return integrateNumerically(partition)
    }

    fun validIntegrationInterval(lowerBoundary: Double, upperBoundary: Double) = lowerBoundary <= upperBoundary

    abstract fun partition(lowerBoundary: Double, upperBoundary: Double): DoubleArray
    abstract fun integrateNumerically(partition: DoubleArray): Double


}