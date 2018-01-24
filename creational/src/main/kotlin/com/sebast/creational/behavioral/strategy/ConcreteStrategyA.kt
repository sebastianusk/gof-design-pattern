package com.sebast.creational.behavioral.strategy

class ConcreteStrategyA : Strategy {
    override fun findMinimum(numbers: List<Int>) = numbers.min()
}