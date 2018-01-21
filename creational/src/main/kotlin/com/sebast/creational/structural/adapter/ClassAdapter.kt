package com.sebast.creational.structural.adapter

class ClassAdapter(operands1: Double, operands2: Double) : Adaptee(operands1, operands2), TargetInterface {
    override fun getOperands() = listOf(operands1, operands2)

    override fun sum() = super.computeSum()

    override fun multiply() = operands1 * operands2
}