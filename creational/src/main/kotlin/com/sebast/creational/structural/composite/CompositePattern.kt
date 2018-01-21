package com.sebast.creational.structural.composite

object CompositePattern {
    fun demo() {
        val n01 = Composite(4, null)
        val n11 = Composite(10, n01)
        val n12 = Composite(2, n01)
        n01.addChild(n11)
        n01.addChild(n12)

        val n21 = Leaf(7, n11)
        val n22 = Leaf(5, n11)

        n11.addChild(n21)
        n11.addChild(n22)

        val n23 = Leaf(1, n12)
        n12.addChild(n23)

        println(n01.getSubtreeSum())

        try {
            n23.addChild(null)
        } catch (e: UnsupportedOperationException) {
            e.printStackTrace()
        }


    }
}