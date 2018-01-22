package com.sebast.creational.behavioral.iterator

class ConcreteAggregate(private val items: List<Place> = mutableListOf()) : Aggregate {

    fun getPlaceAtPosition(position: Int): Place? {
        return try {
            items[position]
        } catch (e: Throwable) {
            null
        }
    }

    fun size() = items.size

    override fun iterator(type: String): Iterator {
        return when (type) {
            "plain" -> ConcreteIterator(this)
            "western" -> WesternPlacesIterator(this)
            else -> ConcreteIterator(this)
        }
    }
}