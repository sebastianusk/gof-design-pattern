package com.sebast.creational.builder

import com.sebast.creational.model.Maze

object BuilderPattern {

    fun createMaze(builder : MazeBuilder): Maze {
        builder.buildMaze()

        builder.buildRoom(1)
        builder.buildRoom(2)
        builder.buildDoor(1, 2)

        return builder.getMaze()
    }

}