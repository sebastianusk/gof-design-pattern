package com.sebast.creational.behavioral.interpreter

class ConstantExpression(private val value: Boolean) : AbstractExpression {
    override fun interpret(context: Context) = value
}