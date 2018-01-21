package com.sebast.creational.structural.composite

class Composite(value: Int, father: Component?) : Component() {

    init {
        this.implementedValue = value
        this.father = father
    }

    private var implementedChildren: MutableList<Component?> = arrayListOf()

    override fun getSubtreeSum(): Int {
        var sum = implementedValue
        implementedChildren.forEach {
            sum += it?.getSubtreeSum() ?: 0
        }
        return sum
    }

    override fun addChild(child: Component?) {
        implementedChildren.add(child)
    }

    override fun removeChild(child: Component) {
        implementedChildren.remove(child)
    }

    override fun getChildren(): List<Component?> {
        return ArrayList(implementedChildren)
    }

}