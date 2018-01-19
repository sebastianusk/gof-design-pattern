package com.sebast.creational.facade

import java.util.*

object FacadePattern {
    fun demo() {
        val module1: AbstractSubsystemModule1 = SubsystemClass1("Jim", 1983)
        val module2: AbstractSubsystemModule2 = SubsystemClass2()
        val facade: AbstractFacade = ConcreteFacade(module1, module2)
        facade.greet()
        val name = module1.getName()
        val birth = module1.getYearOfBirth()
        val age = module2.computeAge(module1,
                Calendar.getInstance().get(Calendar.YEAR))
        val message = "Hello, my name is $name, I was born in $birth and therefore I am $age"
        println(message)
    }
}