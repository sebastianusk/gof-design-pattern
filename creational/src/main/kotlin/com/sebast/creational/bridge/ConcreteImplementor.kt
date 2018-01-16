package com.sebast.creational.bridge

class ConcreteImplementor(val name: String) : Implementor {
    override fun openMouth() {

    }

    override fun tellName() = name
}