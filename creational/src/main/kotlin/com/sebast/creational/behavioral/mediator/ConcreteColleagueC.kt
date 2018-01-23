package com.sebast.creational.behavioral.mediator

class ConcreteColleagueC(name: String, mediator: Mediator?) : Colleague() {
    init {
        this.name = name
        this.mediator = mediator
    }
}