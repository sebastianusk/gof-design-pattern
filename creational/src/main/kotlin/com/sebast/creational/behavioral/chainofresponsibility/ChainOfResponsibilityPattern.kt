package com.sebast.creational.behavioral.chainofresponsibility

object ChainOfResponsibilityPattern {

    fun demo() {
        val first: Handler = NegativeHandler()
        val second: Handler = PositiveHandler()
        val third: Handler = ZeroHandler()
        first.setSuccessor(second)
        second.setSuccessor(third)
        first.handleRequest(-1)
        first.handleRequest(0)
        first.handleRequest(2)
    }
}