package org.example
/*
* Functions:
* Functions are defined using the fun keyword
* followed by the function name, parameters,
* return type, and body.
* Functions can be top-level (outside classes),
* member functions of classes, or local functions
* inside other functions.
* Functions can have parameters and return values.
* Kotlin supports default argument values, named
* arguments, and function overloading.
* Functions can also be declared as extension
* functions to add new functionality to existing types.
* */
//parameterized function and also outside the class function
//also called top-level function
fun greet(name: String) {
    println("Hello, $name")
}

//function within a function and passing parameter
fun printMessage(message: String) {
    fun formatMessage() {
        println("Message: $message")
    }
    fun localParamValue() {
        val message = "Hello, Aditya!"
        println("Message:$message")
    }
    localParamValue()
    formatMessage()

}

//function inside a class
class Greeter {
    fun greet2(name: String) {
        println("Hello, $name")
    }
}

//extension function
//this are added to the existing class
//without modifying the class

fun String.addExclamation(): String {
    return "$this!"
}

fun main(){
    greet("Kotlin")
    printMessage("Hello, World!")
    val greetClass = Greeter()
    greetClass.greet2("Kotlin")
    val message = "Hello, Aditya"
    val exclaimedMessage = message.addExclamation()
    println(exclaimedMessage)
}