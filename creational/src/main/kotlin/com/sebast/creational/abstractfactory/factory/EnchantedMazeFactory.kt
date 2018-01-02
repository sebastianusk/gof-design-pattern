package com.sebast.creational.abstractfactory.factory

import com.sebast.creational.model.Room
import com.sebast.creational.model.enchanted.DoorNeedingSpell
import com.sebast.creational.model.enchanted.EnchantedRoom
import com.sebast.creational.model.enchanted.Spell

class EnchantedMazeFactory : AbstractMazeFactory() {
    override fun makeDoor(room1: Room, room2: Room) = DoorNeedingSpell(room1, room2)
    override fun makeRoom(n: Int) = EnchantedRoom(n)
    protected fun castSpell() : Spell {
        return Spell()
    }
}