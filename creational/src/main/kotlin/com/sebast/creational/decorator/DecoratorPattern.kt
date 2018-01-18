package com.sebast.creational.decorator

object DecoratorPattern {
    fun demo() {
        val component1: AbstractComponent = ConcreteComponent("Bob", 20)
        val jobDecorator: AbstractDecorator = ConcreteDecorator(component1, "student")

        println(jobDecorator.getName())
        println(jobDecorator.getAge())
        println(jobDecorator.getJob())

        class NationalityDecorator(
                private val decorated: AbstractComponent,
                private val nationality: String
        ) : AbstractComponent {
            override fun getName() = decorated.getName()
            override fun getAge() = decorated.getAge()
            fun getNationality() = nationality
        }

        val nationalityDecorator = NationalityDecorator(component1, "japanese")
        println(nationalityDecorator.getName())
        println(nationalityDecorator.getAge())
        println(nationalityDecorator.getNationality())
    }
}