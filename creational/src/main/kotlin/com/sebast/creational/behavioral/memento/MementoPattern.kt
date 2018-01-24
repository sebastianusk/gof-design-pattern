package com.sebast.creational.behavioral.memento

object MementoPattern {
    fun demo() {
        val originator = Originator("original")
        originator.greet()

        val memento = originator.saveState()

        originator.state = "modified"
        originator.greet()

        originator.restoreState(memento)
        originator.greet()
    }
}