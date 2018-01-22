package com.sebast.creational.behavioral.command

class PowerRaiser(private val power: Int) {
    fun raise(number: Int): Int {
        println("Rising $number to power $power")
        return Math.pow(number.toDouble(), power.toDouble()).toInt()
    }

}