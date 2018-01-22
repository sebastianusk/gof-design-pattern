package com.sebast.creational.behavioral.interpreter

class NotExpression(private val operand: AbstractExpression) : AbstractExpression {
    override fun interpret(context: Context) = !operand.interpret(context)
}