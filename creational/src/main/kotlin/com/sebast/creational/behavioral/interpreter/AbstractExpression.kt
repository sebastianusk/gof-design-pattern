package com.sebast.creational.behavioral.interpreter

interface AbstractExpression {
    fun interpret(context: Context): Boolean
}