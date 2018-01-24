package com.sebast.creational.behavioral.strategy

interface Strategy {
    fun findMinimum(numbers: List<Int>): Int?
}