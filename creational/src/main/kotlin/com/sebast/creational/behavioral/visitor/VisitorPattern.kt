package com.sebast.creational.behavioral.visitor

object VisitorPattern {
    fun demo() {
        val a = ConcreteElementA("hello")
        val b = ConcreteElementB(91.567)
        val c = ConcreteElementC(Box("mailbox", 7))
        val d = ConcreteElementA("tom")
        val e = ConcreteElementA("jerry")
        val inner = arrayListOf<Element>(d, e)
        val structure = arrayListOf<Any>(a, b, c, inner)
        val visitor = ConcreteVisitor()
        visitor.visit(structure)
    }
}