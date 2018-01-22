package com.sebast.creational.behavioral.command

class PowerRaiseCommand(private val powerRaiser: PowerRaiser) : Command {
    override fun execute(number: Int) = powerRaiser.raise(number)
}