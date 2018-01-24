package com.sebast.creational.behavioral.state

class StateFactory {
    private val states = mutableMapOf(
            "unversioned" to UnversionedState(),
            "staged" to StagedState(),
            "commited" to CommittedState()
    )

    fun getState(type: String) = states[type]
}