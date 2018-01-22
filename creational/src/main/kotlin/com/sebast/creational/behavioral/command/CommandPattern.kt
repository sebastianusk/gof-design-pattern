package com.sebast.creational.behavioral.command

object CommandPattern {
    fun demo() {
        val multiplier = Multiplier(3)
        val multiplyByThree = MultiplyCommand(multiplier)
        val powerRaiser = PowerRaiser(2)
        val square = PowerRaiseCommand(powerRaiser)
        println(multiplyByThree.execute(7))
        println(square.execute(3))
    }
}