package com.sebast.creational.behavioral.state

class StagedState : State() {
    override fun stage(context: Context) {

    }

    override fun unstage(context: Context) {
        removeFromIndex(context.getName())
        context.setState("unversioned")
    }

    private fun removeFromIndex(name: String) {
        println("Document $name removed from index")
    }

    override fun commit(context: Context) {
        send(context.getName())
        context.setState("committed")
    }

    private fun send(name: String) {
        println("Computing checksum for document $name...")
        println(name.hashCode())
        println("Document $name committed")
    }
}