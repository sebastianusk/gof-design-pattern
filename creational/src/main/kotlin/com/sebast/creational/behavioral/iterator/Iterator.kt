package com.sebast.creational.behavioral.iterator

interface Iterator {
    fun first(): Any?
    fun next(): Any?
    fun hasMore(): Boolean
}