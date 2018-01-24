package com.sebast.creational.behavioral.strategy

class Context(private var strategy: Strategy, val numbers: List<Int>) {

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun getMinimum() = strategy.findMinimum(numbers)

}