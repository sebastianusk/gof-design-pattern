package com.sebast.creational.model

open class Wall : MapSite() {
    public override fun clone(): Wall {
        return super.clone() as Wall
    }
}