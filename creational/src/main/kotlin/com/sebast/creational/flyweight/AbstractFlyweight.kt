package com.sebast.creational.flyweight

abstract class AbstractFlyweight {
    abstract fun greet(externalState: String)
    abstract fun getSharedState(): String
}