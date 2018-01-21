package com.sebast.creational.structural.facade

class SubsystemClass1(
        private val name: String,
        private val yearOfBirth: Int
) : AbstractSubsystemModule1 {
    override fun getName() = name
    override fun getYearOfBirth() = yearOfBirth
}