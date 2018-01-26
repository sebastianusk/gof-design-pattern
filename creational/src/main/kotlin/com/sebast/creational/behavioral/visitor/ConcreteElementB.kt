package com.sebast.creational.behavioral.visitor

class ConcreteElementB(val double: Double) : Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}