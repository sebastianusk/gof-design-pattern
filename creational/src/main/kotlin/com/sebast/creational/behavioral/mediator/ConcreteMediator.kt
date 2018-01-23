package com.sebast.creational.behavioral.mediator

class ConcreteMediator(
        val team: List<Colleague>,
        val all: List<Colleague>
) : Mediator {

    override fun teamGreet() {
        println("Mediator will ask the team to greet")
        team.forEach {
            it.teamGreet()
        }
    }

    override fun broadcastGreet() {
        println("Mediator will ask everyone to greet")
        all.forEach {
            it.greet()
        }
    }
}