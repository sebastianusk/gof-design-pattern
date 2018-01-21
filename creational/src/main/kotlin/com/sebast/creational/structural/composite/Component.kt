package com.sebast.creational.structural.composite

abstract class Component {
    protected var implementedValue: Int = 0
    protected var father: Component? = null

    fun getValue() = implementedValue

    abstract fun getSubtreeSum(): Int

    open fun addChild(child: Component?) {
        throw UnsupportedOperationException()
    }

    open fun removeChild(child: Component) {
        throw UnsupportedOperationException()
    }

    open fun getChildren(): List<Component?> {
        throw UnsupportedOperationException()
    }
}