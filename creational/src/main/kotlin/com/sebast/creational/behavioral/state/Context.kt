package com.sebast.creational.behavioral.state

class Context(private var name: String, var stateFactory: StateFactory) {
    private var state = stateFactory.getState("unversioned")

    fun add() {
        this.state?.stage(this)
        this.state?.commit(this)
    }

    fun revert() {
        this.state?.unstage(this)
    }

    fun getName() = this.name

    fun setState(type: String) {
        this.state = stateFactory.getState(type)
    }


}