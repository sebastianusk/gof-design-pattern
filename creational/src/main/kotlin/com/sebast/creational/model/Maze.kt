package com.sebast.creational.model

class Maze {
    val rooms = mutableListOf<Room>()
    fun addRoom(room: Room) {
        rooms.add(room)
    }

    fun getRoom(roomNumber : Int) : Room? {
        return rooms.find { it.roomNumber == roomNumber }
    }
}