package com.sebast.creational.structural.adapter

class ObjectAdapter(val adaptee: Adaptee) : TargetInterface {
    override fun getOperands() = listOf(adaptee.operands1, adaptee.operands2)

    override fun sum() = adaptee.computeSum()

    override fun max() = adaptee.max()

    override fun multiply() = adaptee.operands1 * adaptee.operands2

}