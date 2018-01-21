package com.sebast.creational.structural.facade

import java.util.*

class ConcreteFacade(
        val module1: AbstractSubsystemModule1,
        val module2: AbstractSubsystemModule2
) : AbstractFacade {
    override fun greet() {
        val name = module1.getName()
        val birth = module1.getYearOfBirth()
        val age = module2.computeAge(module1, Calendar.getInstance().get(Calendar.YEAR))
        println(
                "Hello, my name is $name, I was born in $birth, and therefore I'm $age years old"
        )
    }
}