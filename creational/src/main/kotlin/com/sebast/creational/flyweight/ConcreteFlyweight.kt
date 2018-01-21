package com.sebast.creational.flyweight

class ConcreteFlyweight(private val sharedState: String) : AbstractFlyweight() {
    override fun getSharedState() = sharedState
    override fun greet(externalState: String) {
        println("Hello I am flyweight, my internal state is $sharedState and my external state is $externalState")
    }
}