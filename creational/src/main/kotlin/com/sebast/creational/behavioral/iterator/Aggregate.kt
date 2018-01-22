package com.sebast.creational.behavioral.iterator

interface Aggregate {
    fun iterator(type: String): Iterator
}