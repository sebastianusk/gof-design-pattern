package com.sebast.creational.proxy

class Proxy(
        private val fileName: String,
        private val usersAllowedToRename: List<String>
) : AbstractSubject() {

    val real: ConcreteSubject by lazy { ConcreteSubject(fileName) }
    var cachedLineNumber: Int = 0
    var cachedLine: String? = null

    override fun getContent(): String {
        return real.getContent()
    }

    private fun isAllowed(userName: String) = usersAllowedToRename.contains(userName)

    override fun getLine(lineNumber: Int): String {
        return if (lineNumber == cachedLineNumber) {
            cachedLine!!
        } else {
            cachedLineNumber = lineNumber
            cachedLine = real.getLine(lineNumber)
            cachedLine!!
        }
    }

    override fun rename(userName: String, newName: String) {
        if (isAllowed(userName)) {
            real.rename(userName, newName)
        } else {
            println("Renaming not allowed for user $userName")
        }
    }
}