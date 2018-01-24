package com.sebast.creational.behavioral.observer

class ConcreteSubject(
        private var job: String,
        private var salary: Double
) : Subject {

    private val observers = mutableListOf<Observer>()

    override fun attach(observer: Observer) {
        observers.add(observer)
    }

    override fun detach(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach { it.update(this) }
    }

    override fun getJob() = job

    override fun setJob(newJob: String) {
        this.job = newJob
        notifyObservers()
    }

    override fun getSalary() = salary

    override fun setSalary(newSalary: Double) {
        this.salary = newSalary
        notifyObservers()
    }
}