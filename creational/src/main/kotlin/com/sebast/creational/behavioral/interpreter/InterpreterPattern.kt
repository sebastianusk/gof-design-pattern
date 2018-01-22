package com.sebast.creational.behavioral.interpreter

object InterpreterPattern {
    fun demo() {
        println("***Demo: Interpreter pattern")
        println("Boolean expression: (true AND p) OR (q AND NOT p)")
        println("Truth table:")
        println("P     Q     RESULT")
        println("------------------")
        println("true  true  true")
        println("true  false true")
        println("false true  true")
        println("false false false")
        println("")
        println("Building: syntax tree for the expression")
        val p = VariableExpression("p")
        val q = VariableExpression("q")
        val expression: AbstractExpression = OrExpression(
                AndExpression(ConstantExpression(true), p),
                AndExpression(q, NotExpression(q))
        )
        val context = Context()
        println("Evaluating expression with p=TRUE, q=TRUE")
        context.assign(p, true)
        context.assign(q, true)
        println(expression.interpret(context))
        println("Evaluating expression with p=TRUE, q=FALSE")
        context.assign(p, true)
        context.assign(q, false)
        println(expression.interpret(context))
        println("Evaluating expression with p=FALSE, q=TRUE")
        context.assign(p, false)
        context.assign(q, true)
        println(expression.interpret(context))
        println("Evaluating expression with p=FALSE, q=FALSE")
        context.assign(p, false)
        context.assign(q, false)
        println(expression.interpret(context))
    }
}