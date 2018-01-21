package com.sebast.creational.behavioral.chainofresponsibility.varian

class ConcreteHandlerA : Handler() {
    override fun handleRequest(request: Request) {
        if (request is MyRequestA) {
            val params = request.getParameters()
            println("Request parameters are: ${params[0]}, ${params[1]}. Chain stops here.")
        } else {
            println("Don't know what to do... yielding the request to the next one in the chain")
            sucessor?.handleRequest(request)
        }
    }
}