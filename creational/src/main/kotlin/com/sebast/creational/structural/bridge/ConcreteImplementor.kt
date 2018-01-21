package com.sebast.creational.structural.bridge

class ConcreteImplementor(val name: String) : Implementor {
    override fun openMouth() {

    }

    override fun tellName() = name
}