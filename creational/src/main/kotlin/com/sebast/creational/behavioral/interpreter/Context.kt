package com.sebast.creational.behavioral.interpreter

class Context {
    private val variableExpression = mutableMapOf<String, Boolean>()
    fun assign(expression: VariableExpression, value: Boolean) {
        variableExpression.put(expression.getName(), value)
    }

    fun lookup(varName: String) = variableExpression[varName]
}