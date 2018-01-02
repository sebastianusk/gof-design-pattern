package com.sebast.creational.builder

import com.sebast.creational.model.Maze

abstract class MazeBuilder {

    abstract fun buildMaze()
    abstract fun buildRoom(n: Int)
    abstract fun buildDoor(roomFrom: Int, roomTo: Int)

    abstract fun getMaze(): Maze

}