package com.sebast.creational.behavioral.observer

class ConcreteObserver : Observer {

    var subjectJob = "unknown"
    var subjectSalary = 0.0

    override fun update(subject: Subject) {
        this.subjectJob = subject.getJob()
        this.subjectSalary = subject.getSalary()
        println("I've been notified about Subject's state change")
    }

    fun gossipAboutSubject() {
        println("Recent gossip about Subject: he's working as a $subjectJob and he earns $subjectSalary")
    }
}