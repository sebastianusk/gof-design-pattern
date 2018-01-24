package com.sebast.creational.behavioral.state

abstract class State {
    abstract fun stage(context: Context)
    abstract fun unstage(context: Context)
    abstract fun commit(context: Context)


}