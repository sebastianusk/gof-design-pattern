package com.sebast.creational.behavioral.observer

object ObserverPattern {
    fun demo() {
        val concreteSubject: Subject = ConcreteSubject("Unemployed", 0.0)
        val observer1 = ConcreteObserver()
        val observer2 = ConcreteObserver()

        observer1.gossipAboutSubject()
        observer2.gossipAboutSubject()

        concreteSubject.attach(observer1)
        concreteSubject.attach(observer2)

        concreteSubject.setJob("clerk")

        observer1.gossipAboutSubject()
        observer2.gossipAboutSubject()

        concreteSubject.setSalary(1500.0)

        observer1.gossipAboutSubject()
        observer2.gossipAboutSubject()
    }
}