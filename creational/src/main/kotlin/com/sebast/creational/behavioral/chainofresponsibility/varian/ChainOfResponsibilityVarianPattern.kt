package com.sebast.creational.behavioral.chainofresponsibility.varian

class ChainOfResponsibilityVarianPattern {
    fun demo() {
        val first: Handler = ConcreteHandlerA()
        val second: Handler = ConcreteHandlerB()
        first.setSuccessor(second)

        val myRequestA: Request = MyRequestA("hello", "world")
        first.handleRequest(myRequestA)

        val myRequestB: Request = MyRequestB("cheers")
        first.handleRequest(myRequestB)

        val myRequestC: Request = object : Request() {
            override fun getParameters() = listOf<String>()
        }
        first.handleRequest(myRequestC)

    }
}