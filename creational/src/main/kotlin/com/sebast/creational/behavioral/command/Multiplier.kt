package com.sebast.creational.behavioral.command

class Multiplier(private val multiplier: Int) {

    fun times(number: Int): Int {
        println("Multiplying $number by $multiplier")
        return multiplier * number
    }


}