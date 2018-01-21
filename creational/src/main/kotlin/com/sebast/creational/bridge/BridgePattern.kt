package com.sebast.creational.bridge

object BridgePattern {

    fun demo() {
        val abstraction1: Abstraction = RefinedAbstraction()
        abstraction1.greet()

        val implementor: Implementor = object : Implementor {
            override fun openMouth() {
                println("Too lazy to open mouth")
            }

            override fun tellName() = "mmmhh"

        }
        abstraction1.setImplementor(implementor)
        abstraction1.greet()

        val abstraction2 = object : Abstraction() {

            private var implementor: Implementor? = null

            override fun greet() {
                println(implementor.tellName())
            }

            override fun setImplementor(implementor: Implementor) {
                this.implementor = implementor
            }

        }

        abstraction2.setImplementor(implementor)
        abstraction2.greet()

    }

}