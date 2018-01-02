package com.sebast.creational.builder

import com.sebast.creational.enum.Direction
import com.sebast.creational.model.Door
import com.sebast.creational.model.Maze
import com.sebast.creational.model.Room
import com.sebast.creational.model.Wall

class StandardMazeBuilder: MazeBuilder() {

    var currentMaze: Maze? = null

    override fun buildMaze() {
        currentMaze = Maze()
    }

    override fun buildRoom(n: Int) {
        currentMaze?.apply {
            if (rooms.find { it.roomNumber == n } == null) {
                val room = Room(n)

                room.setSide(Direction.NORTH, Wall())
                room.setSide(Direction.SOUTH, Wall())
                room.setSide(Direction.EAST, Wall())
                room.setSide(Direction.WEST, Wall())

                addRoom(room)
            }
        }
    }

    override fun buildDoor(roomFrom: Int, roomTo: Int) {
        currentMaze?.apply {
            val r1 = getRoom(roomFrom)
            val r2 = getRoom(roomTo)

            if (r1 != null && r2 != null) {
                val door = Door(r1, r2)
                r1.setSide(getCommonWall(r1, r2), door)
                r2.setSide(getCommonWall(r2, r1), door)
            }

        }
    }

    private fun getCommonWall(r1: Room, r2: Room): String {
        return if (Math.abs(r1.roomNumber - r2.roomNumber) == 1) {
            if (r1.roomNumber < r2.roomNumber) {
                Direction.EAST
            } else {
                Direction.WEST
            }
        } else {
            throw RuntimeException("Not side to side")
        }
    }

    override fun getMaze(): Maze {
        return currentMaze!!
    }
}