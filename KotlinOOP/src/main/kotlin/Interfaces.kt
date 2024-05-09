/*interface Printable {
    fun print()
}

interface Serializable {
    fun serializable()
}

class Document(val name: String): Printable, Serializable {
    override fun print() {
        println("Printing $name()")
    }

    override fun serializable() {
        println("Serializing $name()")
    }
}

fun main() {
    val doc = Document("Kotlin")
    doc.print()
    doc.serializable()
}*/

interface Shape {
    val area: Double
    fun draw()
}

class Rectangle(private val width: Double, private val height: Double): Shape {
    override val area: Double = width * height
    override fun draw() {
        println("Rectangle")
    }
}

class Circle(private val radius: Double): Shape {
    override val area: Double = 3 * radius
    override fun draw() {
            println("Circle")
    }
}

fun main() {
    val shapes = listOf(Rectangle(5.0, 6.0), Circle(3.0))
    for(shape in shapes) {
        println("Area: ${shape.area}")
        shape.draw()
    }
}