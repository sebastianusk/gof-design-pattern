package com.sebast.creational.abstractfactory.factory

import com.sebast.creational.model.*

open class AbstractMazeFactory {
    fun makeMaze() = Maze()
    open fun makeWall() = Wall()
    open fun makeRoom(n: Int) = Room(n)
    open fun makeDoor(room1: Room, room2: Room) = Door(room1, room2)
}