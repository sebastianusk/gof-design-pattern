package com.sebast.creational.structural.decorator

class ConcreteComponent(
        private val name: String,
        private val age: Int) : AbstractComponent {
    override fun getName() = name
    override fun getAge() = age
}