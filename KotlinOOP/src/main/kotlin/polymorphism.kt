/*interface Shapes {
    fun draw()
}

class Rectangles(val width: Double,val height: Double): Shapes {
    override fun draw() {
        println("Drawing Rectangle")
    }
}

class Circles(val radius: Double): Shapes {
    override fun draw() {
        println("Drawing Circle")
    }
}

fun drawShapes(vararg shapes: Shapes) {//vararg - means it takes variable no. of arguments of type Shape
    for(shape in shapes) {
        shape.draw()
    }
}

fun main() {
    val shapes = listOf(Rectangles(5.0,7.0), Circles(5.0))
    drawShapes(*shapes.toTypedArray())
}


//subtype aka inheritance
interface Shapes {
    fun draw()
}

class Rectangles(val width: Int, val height: Int): Shapes {
    override fun draw() {
        println("Drawing Rectangle")
    }
}

class Circles(val radius: Int): Shapes {
    override fun draw() {
        println("Drawing Circle")
    }
}

fun drawShapes(vararg shapes: Shapes) {
    for(shape in shapes) {
        shape.draw()
    }
}

fun main() {
    val rect = Rectangles(5,6)
    val cir = Circles(7)
    drawShapes(rect, cir)
}

//method overloading
class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun add(a: String, b: String): String {
        return a + b
    }
}

fun main() {
    val calc = Calculator()
    println(calc.add("Hello ", "World"))//method overloading()
    println(calc.add(5, 6))//method overloading()
    println(calc.add(5.4, 6.7))//method overloading()
}*/

//method overriding

open class Animals {
    open fun makeSound() {
        println("Animal makes sound")
    }
}

class Dogs: Animals() {
    override fun makeSound() {
        println("Dog barks")
    }
}

class Cats: Animal() {
    override fun makeSound() {
        println("Cat meows")
    }
}

fun main() {
    val dog = Dogs()
    val cat = Cats()
    dog.makeSound()
    cat.makeSound()
}