package com.sebast.creational.behavioral.state

class CommittedState : State() {
    override fun stage(context: Context) {

    }

    override fun unstage(context: Context) {
        removeFromRepository(context.getName())
        context.setState("unversioned")
    }

    override fun commit(context: Context) {

    }

    fun removeFromRepository(name: String) {
        println("Document $name removed from repository")
    }
}