package com.sebast.creational.prototype

import com.sebast.creational.abstractfactory.factory.AbstractMazeFactory
import com.sebast.creational.model.Door
import com.sebast.creational.model.Maze
import com.sebast.creational.model.Room
import com.sebast.creational.model.Wall

class MazePrototypeFactory(
        private val prototypeMaze: Maze,
        private val prototypeRoom: Room,
        private val prototypeWall: Wall,
        private val prototypeDoor: Door
) : AbstractMazeFactory() {

    override fun makeWall(): Wall {
        return prototypeWall.clone()
    }

    override fun makeDoor(room1: Room, room2: Room): Door {
        return prototypeDoor.clone()
    }

    override fun makeRoom(n: Int): Room {
        return super.makeRoom(n)
    }

}