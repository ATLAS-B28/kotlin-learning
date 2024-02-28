package org.example

fun main() {
    //numbers
    //byte - 8-bit signed integer
    val a: Byte = 1
    println(a)
    //short - 16-bit signed integer
    val b: Short = 2
    println(b)
    //Int - 32-bit signed integer
    val c: Int = 3
    println(c)
    //Long 64-bit signed integer
    val d: Long = 44
    println(d)
    //Float 32-bit floating point
    val e: Float = 4.0F
    println(e)
    //Double 64-bit floating point
    val f: Double = 5.1
    println(f)

    //boolean
    val g: Boolean = true
    println(g)

    //characters - represents a
    //single 16-bit Unicode character
    val h: Char = 'h'
    println(h)

    //string - a sequence of characters
    val i: String = "hello"
    println(i)

    //array = represents a collection
    //of elements the same type
    val j: Array<Int> = arrayOf(1,2,3,4)
    println("for with in")
    for(k in j) {
        println(k)
    }
    println("forEach")
    j.forEach { ele -> println(ele) }
}