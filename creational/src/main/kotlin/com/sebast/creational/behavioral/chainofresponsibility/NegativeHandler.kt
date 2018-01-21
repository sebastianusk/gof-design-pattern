package com.sebast.creational.behavioral.chainofresponsibility

class NegativeHandler : Handler() {
    override fun handleRequest(number: Int) {
        if (number < 0) {
            println("The number $number is negative. Chain stop here")
            return
        }
        println("Don't know what to do, yielding the request to he next one in chain")
        this.sucessor?.handleRequest(number)
    }
}