package com.sebast.creational.behavioral.chainofresponsibility

class ZeroHandler : Handler() {
    override fun handleRequest(number: Int) {
        if (number == 0) {
            println("The number $number is zero. Chain stop here")
            return
        }
        println("Don't know what to do, rising exception")
        throw IllegalArgumentException()
    }
}