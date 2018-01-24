package com.sebast.creational.behavioral.state

class UnversionedState : State() {
    override fun stage(context: Context) {
        addToIndex(context.getName())
        context.setState("staged")
    }

    private fun addToIndex(name: String) {
        println("Document $name added to index")
    }

    override fun unstage(context: Context) {

    }

    override fun commit(context: Context) {

    }
}