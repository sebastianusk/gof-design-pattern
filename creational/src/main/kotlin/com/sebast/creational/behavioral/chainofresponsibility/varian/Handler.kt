package com.sebast.creational.behavioral.chainofresponsibility.varian

abstract class Handler {

    protected var sucessor: Handler? = null

    fun setSuccessor(handler: Handler) {
        this.sucessor = handler
    }

    abstract fun handleRequest(request: Request)

}