package com.sebast.creational.bridge

class RevinedAbstraction(private var implementor: Implementor = ConcreteImplementor("Sarah")) : Abstraction() {

    override fun greet() {
        implementor.openMouth()
        val name = implementor.tellName()
        println("Hello my name is $name")
    }

    override fun setImplementor(implementor: Implementor) {
        this.implementor = implementor
    }
}