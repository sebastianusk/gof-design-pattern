package com.sebast.creational.structural.flyweight

object FlyweightPattern {
    fun demo() {
        val factory = FlyweightFactory()
        val fly1: AbstractFlyweight = ConcreteFlyweight("concrete")

        class ShyFlyweight : AbstractFlyweight() {
            override fun getSharedState() = "shy"
            override fun greet(externalState: String) {
                println("I am a shy flyweight")
            }
        }

        val fly2: AbstractFlyweight = ShyFlyweight()
        factory.registerFlyweight("concrete", fly1)
        factory.registerFlyweight("shy", fly2)

        val flyweight = factory.getFlyweight("concrete")
        flyweight?.greet("external state specified by the clients")
    }
}