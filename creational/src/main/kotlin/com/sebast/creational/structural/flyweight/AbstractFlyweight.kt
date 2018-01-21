package com.sebast.creational.structural.flyweight

abstract class AbstractFlyweight {
    abstract fun greet(externalState: String)
    abstract fun getSharedState(): String
}