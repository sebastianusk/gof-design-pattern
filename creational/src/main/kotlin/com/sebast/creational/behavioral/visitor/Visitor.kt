package com.sebast.creational.behavioral.visitor

interface Visitor {
    fun visit(collection: Collection<Any>)
    fun visit(concreteElementA: ConcreteElementA)
    fun visit(concreteElementB: ConcreteElementB)
    fun visit(concreteElementC: ConcreteElementC)
}