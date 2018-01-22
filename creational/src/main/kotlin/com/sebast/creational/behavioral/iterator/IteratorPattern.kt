package com.sebast.creational.behavioral.iterator

object IteratorPattern {
    fun demo() {
        val places = listOf(
                Place("New York", 40.47, -73.58),
                Place("Madrid", 40.27, -3.42),
                Place("Milan", 45.27, 9.10),
                Place("Paris", 48.48, 2.20),
                Place("Berlin", 52.30, 12.25),
                Place("Oslo", 59.57, 10.42)
        )
        val travel: Aggregate = ConcreteAggregate(places)
        val iterator1 = travel.iterator("plain")

        var hasMore = iterator1.hasMore()
        while (hasMore) {
            println("Iterating: next place of our travel")
            (iterator1.next() as Place).describe()
            hasMore = iterator1.hasMore()
            println("Checking: more place to come? $hasMore")
        }

        val iterator2 = travel.iterator("western")
        hasMore = iterator2.hasMore()
        while (hasMore) {
            println("Iterating: next place of our travel")
            (iterator2.next() as Place).describe()
            hasMore = iterator2.hasMore()
            println("Checking: more places to come? $hasMore")
        }

    }
}