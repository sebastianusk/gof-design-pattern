package com.sebast.creational.behavioral.iterator

class ConcreteIterator(private val iterable: ConcreteAggregate) : Iterator {

    var currentIndex = 0

    override fun first(): Any? {
        return iterable.getPlaceAtPosition(0)
    }

    override fun next(): Any? {
        val result = iterable.getPlaceAtPosition(currentIndex)
        currentIndex++
        return result
    }

    override fun hasMore() = iterable.getPlaceAtPosition(currentIndex) != null
}