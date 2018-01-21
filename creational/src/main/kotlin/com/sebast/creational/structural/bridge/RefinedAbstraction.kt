package com.sebast.creational.structural.bridge

class RefinedAbstraction(private var implementor: Implementor = ConcreteImplementor("Sarah")) : Abstraction() {

    override fun greet() {
        implementor.openMouth()
        val name = implementor.tellName()
        println("Hello my name is $name")
    }

    override fun setImplementor(implementor: Implementor) {
        this.implementor = implementor
    }
}