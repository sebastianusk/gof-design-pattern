package com.sebast.creational.facade

interface AbstractSubsystemModule2 {
    fun computeAge(module: AbstractSubsystemModule1, currentYear: Int): Int
}