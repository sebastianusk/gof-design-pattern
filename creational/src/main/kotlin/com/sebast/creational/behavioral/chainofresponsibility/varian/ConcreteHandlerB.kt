package com.sebast.creational.behavioral.chainofresponsibility.varian

class ConcreteHandlerB : Handler() {
    override fun handleRequest(request: Request) {
        if (request is MyRequestB) {
            val params = request.getParameters()
            println("Request parameters are: ${params[0]}. Chain stops here.")
        } else {
            println("Don't know what to do... rising exception")
            throw IllegalArgumentException()
        }
    }
}