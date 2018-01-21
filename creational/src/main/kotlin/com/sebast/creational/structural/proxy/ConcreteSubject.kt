package com.sebast.creational.structural.proxy

class ConcreteSubject(private val fileName: String) : AbstractSubject() {
    override fun getContent() = "abdefghijklmnopqrstuvwxyz"

    override fun getLine(lineNumber: Int) = "Hello I am line number $lineNumber"

    override fun rename(userName: String, newName: String) {
        println("User $userName is renaming file $fileName to $newName")
    }
}