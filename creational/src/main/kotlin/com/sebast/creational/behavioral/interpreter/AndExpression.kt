package com.sebast.creational.behavioral.interpreter

class AndExpression(private val operand1: AbstractExpression, private val operand2: AbstractExpression) : AbstractExpression {
    override fun interpret(context: Context) = operand1.interpret(context) && operand2.interpret(context)
}