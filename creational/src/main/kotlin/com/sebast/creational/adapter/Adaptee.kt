package com.sebast.creational.adapter

open class Adaptee(val operands1: Double, val operands2: Double) {

    fun computeSum() = operands1 + operands2

    fun max() = Math.max(operands1, operands2)

}