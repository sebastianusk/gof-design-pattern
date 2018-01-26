package com.sebast.creational.behavioral.template

class ConcreteClassB(nSteps: Int) : ConcreteClassA(nSteps) {

    override fun integrateNumerically(partition: DoubleArray): Double {
        val step = partition[1] - partition[0]
        return (0 until partition.size).sumByDouble {
            step * Math.pow(2, (partition[it] + partition[it + 1]) / 2)
        }
    }

}