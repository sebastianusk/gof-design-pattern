package com.sebast.creational.behavioral.memento

class Originator(var state: String) {

    fun saveState() = Memento(state)

    fun restoreState(memento: Memento) {
        state = memento.state
    }

    fun greet() {
        println("My state is $state")
    }
}