package com.sebast.creational.direct

import com.sebast.creational.enum.Direction
import com.sebast.creational.model.Door
import com.sebast.creational.model.Maze
import com.sebast.creational.model.Room
import com.sebast.creational.model.Wall

object Direct {
    fun createMaze() : Maze {
        val aMaze = Maze()
        val r1 = Room(1)
        val r2 = Room(2)
        val aDoor = Door(r1, r2)
        aMaze.addRoom(r1)
        aMaze.addRoom(r2)
        r1.setSide(Direction.NORTH, Wall())
        r1.setSide(Direction.EAST, aDoor)
        r1.setSide(Direction.SOUTH, Wall())
        r1.setSide(Direction.WEST, Wall())
        r2.setSide(Direction.NORTH, Wall())
        r2.setSide(Direction.EAST, Wall())
        r2.setSide(Direction.SOUTH, Wall())
        r2.setSide(Direction.WEST, aDoor)
        return aMaze
    }
}
