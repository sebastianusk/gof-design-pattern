package com.sebast.creational

import com.sebast.creational.abstractfactory.AbstractFactory
import com.sebast.creational.abstractfactory.factory.BombMazeFactory
import com.sebast.creational.abstractfactory.factory.EnchantedMazeFactory
import com.sebast.creational.abstractfactory.factory.AbstractMazeFactory
import com.sebast.creational.builder.BuilderPattern
import com.sebast.creational.builder.MazeBuilder
import com.sebast.creational.builder.StandardMazeBuilder
import com.sebast.creational.direct.Direct

fun main(args: Array<String>) {
    println("Hello")

    val directMaze = Direct.createMaze()
    println(directMaze)

    val bombFactory = BombMazeFactory()
    val enchantedFactory = EnchantedMazeFactory()
    val abstractFactory = AbstractMazeFactory()
    val bombMaze = AbstractFactory.createMaze(bombFactory)
    val enchantedMaze = AbstractFactory.createMaze(enchantedFactory)
    val abstractFactoryMaze = AbstractFactory.createMaze(abstractFactory)
    println(bombMaze)
    println(enchantedMaze)
    println(abstractFactoryMaze)

    val standardMazeBuilder: MazeBuilder = StandardMazeBuilder()
    val standardMaze = BuilderPattern.createMaze(standardMazeBuilder)
    println(standardMaze)

}