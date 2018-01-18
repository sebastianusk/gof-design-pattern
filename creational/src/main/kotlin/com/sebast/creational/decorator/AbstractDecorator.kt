package com.sebast.creational.decorator

abstract class AbstractDecorator(private val decorated: AbstractComponent) : AbstractComponent {
    override fun getName() = decorated.getName()

    override fun getAge() = decorated.getAge()

    abstract fun getJob(): String

}