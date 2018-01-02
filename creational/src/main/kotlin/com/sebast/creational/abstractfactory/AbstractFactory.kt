package com.sebast.creational.abstractfactory

import com.sebast.creational.enum.Direction
import com.sebast.creational.abstractfactory.factory.AbstractMazeFactory
import com.sebast.creational.model.Maze


object AbstractFactory {
    fun createMaze(factory: AbstractMazeFactory) : Maze {
        val aMaze = factory.makeMaze()
        val r1 = factory.makeRoom(1)
        val r2 = factory.makeRoom(2)
        val aDoor = factory.makeDoor(r1, r2)
        aMaze.addRoom(r1)
        aMaze.addRoom(r2)
        r1.setSide(Direction.NORTH, factory.makeWall())
        r1.setSide(Direction.EAST, aDoor)
        r1.setSide(Direction.SOUTH, factory.makeWall())
        r1.setSide(Direction.WEST, factory.makeWall())
        r2.setSide(Direction.NORTH, factory.makeWall())
        r2.setSide(Direction.EAST, factory.makeWall())
        r2.setSide(Direction.SOUTH, factory.makeWall())
        r2.setSide(Direction.WEST, aDoor)
        return aMaze
    }
}
