package com.sebast.creational.behavioral.observer

interface Subject {

    fun attach(observer: Observer)

    fun detach(observer: Observer)

    fun notifyObservers()

    fun getJob(): String

    fun setJob(newJob: String)

    fun getSalary(): Double

    fun setSalary(newSalary: Double)

}