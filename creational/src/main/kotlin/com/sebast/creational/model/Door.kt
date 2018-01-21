package com.sebast.creational.model

open class Door(val room1: Room, val room2: Room) : MapSite() {
    var isOpen = false
    fun otherSideFrom(room: Room) = if (room == room1) room2 else room1
    public override fun clone(): Door {
        return super.clone() as Door
    }
}