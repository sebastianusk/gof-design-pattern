package com.sebast.creational.abstractfactory.factory

import com.sebast.creational.model.bomb.BombedWall
import com.sebast.creational.model.bomb.RoomWithABomb

class BombMazeFactory: AbstractMazeFactory() {
    override fun makeWall() = BombedWall()
    override fun makeRoom(n: Int) = RoomWithABomb(n)
}