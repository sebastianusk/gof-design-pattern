package com.sebast.creational.behavioral.strategy

class ConcreteStrategyB : Strategy{
    override fun findMinimum(numbers: List<Int>): Int? {
        var minimum= numbers[0]
        for (number in numbers) {
            if (number < minimum) minimum = number
        }
        return minimum
    }
}