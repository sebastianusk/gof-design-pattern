package com.sebast.creational.structural.proxy

object ProxyPattern {
    fun demo() {
        val proxy: AbstractSubject = Proxy("test.txt", listOf("bob", "mark", "fred"))
        println(proxy.getContent())
        println(proxy.getLine(47))
        proxy.rename("alice", "test_1.txt")
        proxy.rename("fred", "test_1.txt")
    }
}