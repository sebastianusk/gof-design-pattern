package com.sebast.creational.behavioral.strategy

object StrategyPattern {
    fun demo() {
        val numbers = listOf(5, 8, 1, 14, 3)
        val strategyA = ConcreteStrategyA()
        val context = Context(strategyA, numbers)
        println(context.getMinimum())
        context.setStrategy(ConcreteStrategyB())
        println(context.getMinimum())
    }
}