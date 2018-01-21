package com.sebast.creational.structural.proxy

abstract class AbstractSubject {
    abstract fun getContent(): String
    abstract fun getLine(lineNumber: Int): String
    abstract fun rename(userName: String, newName: String)
}