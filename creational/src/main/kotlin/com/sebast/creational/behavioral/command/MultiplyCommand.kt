package com.sebast.creational.behavioral.command

class MultiplyCommand(private val multiplier: Multiplier) : Command {
    override fun execute(number: Int) = multiplier.times(number)
}