package com.sebast.creational.behavioral.visitor

data class Box(val label: String, val number: Int) {
    override fun toString() = "[$label - $number]"
}