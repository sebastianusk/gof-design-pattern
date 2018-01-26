package com.sebast.creational.behavioral.template

object TemplatePattern {
    fun demo() {
        val trapezoidalIntegrator: AbstractClass = ConcreteClassA(10)
        println(trapezoidalIntegrator.doIntegrateParabola(0.0, 5.3))
        val midPointIntegratior: AbstractClass = ConcreteClassB(10)
        println(midPointIntegratior.doIntegrateParabola(0.0, 5.3))
    }
}