package com.sebast.creational.behavioral.iterator

class Place(
        val toponym: String,
        val latitude: Double,
        val longitude: Double
) {
    fun describe() {
        println("$toponym - lat=$latitude lon=$longitude")
    }
}