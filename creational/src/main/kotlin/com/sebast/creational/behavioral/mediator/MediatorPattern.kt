package com.sebast.creational.behavioral.mediator

object MediatorPattern {

    fun demo() {
        val colleagueA: Colleague = ConcreteColleagueA("Tom", null)
        val colleagueB: Colleague = ConcreteColleagueB("Linda", null)
        val colleagueC: Colleague = ConcreteColleagueC("Joe", null)
        val team = listOf(colleagueB, colleagueC)
        val all = listOf(colleagueA, colleagueB, colleagueC)
        val mediator = ConcreteMediator(team, all)
        colleagueA.mediator = mediator
        colleagueB.mediator = mediator
        colleagueC.mediator = mediator
        colleagueB.introduceEveryone()
        colleagueC.introduceTheTeam()
    }
}