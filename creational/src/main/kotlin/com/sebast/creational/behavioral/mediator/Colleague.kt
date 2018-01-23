package com.sebast.creational.behavioral.mediator

abstract class Colleague {
    var mediator: Mediator? = null
    protected var name: String? = null
    open fun introduceTheTeam() {

    }

    open fun introduceEveryone() {

    }

    open fun teamGreet() {
        println("Hi! I am a team member $name")
    }

    open fun greet() {
        println(name)
    }
}