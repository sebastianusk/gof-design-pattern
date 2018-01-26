package com.sebast.creational.behavioral.visitor

interface Element {
    fun accept(visitor: Visitor)
}