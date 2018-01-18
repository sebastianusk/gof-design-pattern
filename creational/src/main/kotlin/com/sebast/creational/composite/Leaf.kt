package com.sebast.creational.composite

class Leaf(value: Int, father: Component) : Component() {

    init {
        this.implementedValue = value
        this.father = father
    }

    override fun getSubtreeSum() = implementedValue
}