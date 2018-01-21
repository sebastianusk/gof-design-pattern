package com.sebast.creational.structural.adapter


object Demo {
    fun demo() {
        val adaptee = Adaptee(3.2, 6.7)
        val classAdapter: TargetInterface = ClassAdapter(3.2, 6.7)

        println(adaptee.operands1)
        println(adaptee.operands2)
        println(classAdapter.getOperands())
        println(adaptee.computeSum())
        println(classAdapter.sum())

        val objectAdapter: TargetInterface = ObjectAdapter(adaptee)

        println(adaptee.operands1)
        println(adaptee.operands2)
        println(objectAdapter.getOperands())
        println(adaptee.computeSum())
        println(objectAdapter.sum())

    }
}
