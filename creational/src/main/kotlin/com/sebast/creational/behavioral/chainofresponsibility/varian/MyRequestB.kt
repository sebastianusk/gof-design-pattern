package com.sebast.creational.behavioral.chainofresponsibility.varian

class MyRequestB(val parameter1: String) : Request() {
    override fun getParameters() = listOf(parameter1)
}