package com.sebast.creational.behavioral.visitor

class ConcreteElementC(val box: Box) : Element {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}