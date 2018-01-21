package com.sebast.creational.flyweight

class FlyweightFactory {

    val flyweights = mutableMapOf<String, AbstractFlyweight>()

    fun registerFlyweight(key: String, flyweight: AbstractFlyweight) {
        flyweights.put(key, flyweight)
    }

    fun getFlyweight(key: String) = flyweights[key]

}