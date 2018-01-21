package com.sebast.creational.behavioral.chainofresponsibility.varian

abstract class Request {
    abstract fun getParameters(): List<String>
}