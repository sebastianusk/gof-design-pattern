package com.sebast.creational.structural.facade

class SubsystemClass2 : AbstractSubsystemModule2 {
    override fun computeAge(module: AbstractSubsystemModule1, currentYear: Int) = currentYear - module.getYearOfBirth()
}