package com.sebast.creational.behavioral.iterator

class WesternPlacesIterator(private val iterable: ConcreteAggregate) : Iterator {
    var currentIndex = findFirstWesternPlace()

    private fun findFirstWesternPlace(): Int {
        for (index in 0..iterable.size()) {
            iterable.getPlaceAtPosition(index)?.also {
                if (isWestern(it)) {
                    return index
                }
            }
        }
        return -1
    }

    private fun isWestern(place: Place): Boolean {
        return place.longitude < 0
    }

    override fun first() = if (currentIndex == -1) null else iterable.getPlaceAtPosition(currentIndex)

    override fun next(): Any? {
        return if (currentIndex == -1) {
            null
        } else {
            val result = iterable.getPlaceAtPosition(currentIndex)
            currentIndex = findFirstWesternPlace()
            result
        }
    }

    override fun hasMore() = iterable.getPlaceAtPosition(currentIndex) != null
}