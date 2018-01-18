package com.sebast.creational.decorator

class ConcreteDecorator(
        decorated: AbstractComponent,
        private val job: String
) : AbstractDecorator(decorated) {
    override fun getJob() = job
}