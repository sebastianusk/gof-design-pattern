package com.sebast.creational.behavioral.chainofresponsibility.varian

class MyRequestA(
        val parameter1: String,
        val parameter2: String
) : Request() {
    override fun getParameters() = listOf(parameter1, parameter2)
}