package org.example

import org.example.ab.Abstract
import org.example.ab.Shape
import org.example.org.example.Inject
import org.example.org.example.MyAnnotation



class ClassBasic(private val brand: String, private val model: String) {
  fun startEngine() {
      println("The $brand $model engine is starting")
  }
}
/*
* If you want to run some code during
* object creation, use initializer
* blocks inside the class body.
* Initializer blocks are declared
* with the init keyword followed by
* curly braces. Write any code that
* you want to run within the curly
* braces.
* */
class Init(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}


//using annotation
@Inject
class Customer(val name: String, val age: Int  )

@MyAnnotation("Aditya", 21)
class MyClass {
    fun printMessage(message: String) {
        println(message)
    }
}

class Person(val name: String) {
    val children: MutableList<Person> = mutableListOf()
    constructor(name: String, parent: Person)
       /*allows the constructor to reuse
       * initialization logic from another constructor
       * in the class*/ : this(name) {
           //this -> refers to the current instance
           //of the class itself
        parent.children.add(this)//add children to parent as person class
    }

    fun addChild(child: Person) {
        children.add(child)
    }

    fun addChildren(children : List<Person>) {
        this.children.addAll(children)
    }

    fun removeChild(child: Person) {
        children.remove(child)
    }
}

//abstract class usage

class Circle(private val radius: Double): Abstract() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}
/*
* You can override a non-abstract open member with an abstract one.
* */
open class Polygon {
    open fun draw() {
        println("Drawing a polygon")
    }
}

abstract class WildShape : Polygon() {
    abstract override fun draw()
}

class Rhombus : WildShape() {
    override fun draw() {
        println("Drawing a rhombus")
    }
}

class Circle2(override val color: String, val radius: Double): Shape {
    override fun calArea(): Double {
        return Math.PI * radius * radius
    }

}

fun main() {
    val car = ClassBasic("Toyota","Corolla")
    car.startEngine()
    //object
    /*
    * The object keyword can also be
    * used to create anonymous objects
    * and object expressions, which
    * are instances of an ad-hoc class
    * that extends a certain type or
    * types. These are particularly
    * useful for creating objects with
    * a single instance and for defining
    * anonymous classes on the fly.
    * */
    Logger.log("Aditya Bhambere")

    val init = Init("Aditya")

    println(init.firstProperty)
    println(init.secondProperty)

    val customer = Customer("Aditya",21)

    println(customer.name)
    println(customer.age)

    //annotation with params
    val myAnnotate = MyClass()
    myAnnotate.printMessage("Aditya Bhambere")

    val person = Person("Aditya")
    val person2 = Person("Aditya",person)

    println(person.children)
    println(person2.children)

    person.name

    person.addChild(person2)
    person.children
    println(person.children[0].name)
    person.addChildren(listOf(person2))
    person.children
    println(person.children[1].name)
    person.removeChild(person2)
    person.children
    println(person.children[0].name)
    for (child in person.children) {
        println(child.name)
    }

    val circle = Circle(9.3)
    println(circle.calculateArea())

    val rhombus = Rhombus()
    rhombus.draw()

    val circle2 = Circle2("blue",9.3)
    println(circle2.color)
    println(circle2.radius)
    println(circle2.calArea())
}
