package com.sebast.creational.model

open class Room(val roomNumber: Int): MapSite() {

    private val mapSides= hashMapOf<String, MapSite>()

    fun setSide(direction: String, mapSite: MapSite) {
        mapSides[direction] = mapSite
    }
}