package com.sebast.creational.model

class Maze(val rooms: MutableList<Room> = mutableListOf()) : Cloneable {

    fun addRoom(room: Room) {
        rooms.add(room)
    }

    fun getRoom(roomNumber: Int): Room? {
        return rooms.find { it.roomNumber == roomNumber }
    }

    override fun clone(): Maze {
        return super.clone() as Maze
    }
}