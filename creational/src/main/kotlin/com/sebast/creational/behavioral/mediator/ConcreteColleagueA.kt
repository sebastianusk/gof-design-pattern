package com.sebast.creational.behavioral.mediator

class ConcreteColleagueA(name: String, mediator: Mediator?) : Colleague() {
    init {
        this.name = name
        this.mediator = mediator
    }

    override fun introduceTheTeam() {
        teamUpdate()
    }

    private fun teamUpdate() {
        mediator?.teamGreet()
    }
}