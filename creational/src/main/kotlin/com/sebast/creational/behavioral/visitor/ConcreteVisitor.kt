package com.sebast.creational.behavioral.visitor

class ConcreteVisitor : Visitor {
    override fun visit(collection: Collection<Any>) {
        collection.forEach {
            if (it is Element) {
                println("Found: Element, will be visited")
                it.accept(this)
            } else if (it is Collection<*>) {
                println("Found Collection: will be visited")
                visit(it as Collection<Any>)
            }
        }
    }

    override fun visit(concreteElementA: ConcreteElementA) {
        println(concreteElementA.string)
    }

    override fun visit(concreteElementB: ConcreteElementB) {
        println(concreteElementB.double)
    }

    override fun visit(concreteElementC: ConcreteElementC) {
        println(concreteElementC.box)
    }
}