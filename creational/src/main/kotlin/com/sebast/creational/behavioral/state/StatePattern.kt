package com.sebast.creational.behavioral.state

class StatePattern {
    fun demo() {
        val factory = StateFactory()
        val context = Context("file.txt", factory)
        context.add()
        context.revert()
    }
}