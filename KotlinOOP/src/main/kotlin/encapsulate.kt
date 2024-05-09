class Person(private val name: String, private val age: Int) {
    val fullName: String
        get() = "$name $age" // public property with a getter

    fun greet() {
        println("Hello, $name")
    }
}

fun main() {
    val person = Person("Aditya",22)
    person.greet()
    println(person.fullName)
}