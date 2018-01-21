package com.sebast.creational.structural.decorator

class ConcreteDecorator(
        decorated: AbstractComponent,
        private val job: String
) : AbstractDecorator(decorated) {
    override fun getJob() = job
}