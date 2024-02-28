package org.example.ab

interface Shape {
    fun calArea(): Double //abstract method
    val color: String//property declaration
    fun getDescription() {//default implementation
        println("I am a $color shape")
    }
}