package com.sebast.creational.behavioral.visitor

class ConcreteElementA(val string: String) : Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}