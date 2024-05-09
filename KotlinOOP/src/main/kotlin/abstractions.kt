abstract class Animal {
    abstract fun makeSound()
    fun eat() {
        println("Eating")
    }
}

class Dog: Animal() {
    override fun makeSound() {
        println("Bark")
    }
}

class Cat: Animal() {
    override fun makeSound() {
        println("Meow")
    }
}

fun main() {
    val animals = listOf(Dog(), Cat())
    for(animal in animals) {
        animal.makeSound()
        animal.eat()
    }
}