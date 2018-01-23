package com.sebast.creational.behavioral.mediator

class ConcreteColleagueB(name: String, mediator: Mediator?) : Colleague() {
    init {
        this.name = name
        this.mediator = mediator
    }

    override fun introduceEveryone() {
        broadcastUpdate()
    }

    private fun broadcastUpdate() {
        mediator?.broadcastGreet()
    }

}