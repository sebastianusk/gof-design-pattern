package com.sebast.creational.behavioral.interpreter

class VariableExpression(private val name: String) : AbstractExpression {
    fun getName() = name
    override fun interpret(context: Context) = context.lookup(name) ?: false
}