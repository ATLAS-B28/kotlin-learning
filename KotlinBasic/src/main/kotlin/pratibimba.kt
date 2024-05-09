package org.example

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions

data class User(val name: String, val age: Int)
data class User2(val name: String) {
    fun getFullName(): String {
        return name
    }
}

fun main() {
    val user = User("Aditya", 22)
    val user2 = User2("Aditya")
    val callable = user::class.memberFunctions.first {it.name == "getFullName"}
    //user::class.members.first { it.name == "getFullName" }
    val result = callable.call(user)
    println(result)
    val userType: KClass<User> = User::class
    println(userType.simpleName)
    val userClass/*: KClass<out User>*/ = userType.javaObjectType.kotlin
    println(userClass.simpleName)
}