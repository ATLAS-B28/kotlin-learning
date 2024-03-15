package org.example

fun compareToWhen(option: Int) {
    val result = when(option) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "Invalid option"
    }
    println(result)
}
fun main() {
   fun compare(num: Int) {
       val result = if (num > 5) {
           "Greater than 5"
       } else if(num == 5) {
           "Equal to 5"
       } else {
           "Less than or equal to 5"
       }
       println(result)
   }
    compare(10)
    compareToWhen(3) // 2 is an Int

    println("for and ...")
    for(i in 1..6) {
        println(i)
    }

    //downTo - counts form higher to lower value
    //step - specifies the value of increment or decrement
    println("downTo and step")
    for(i in 10 downTo 1 step 2) {
        //here, although we have a step with positive 2, we are going
        //down to 1; therefore, it is decrementing from 10
        println(i)
    }

    println("while")
    var i = 0
    while(i < 5) {
        println(i)
        i++
    }

    println("do while")
    var j = 0
    do {
        println(j)
        j++
    } while(j < 9)
//continue and break
    println("continue and break")
    for (k in 1..10) {
        if(k == 5) {
            break
        }
        if(k % 2  == 0) {
            continue
        }
        println(k)
    }

    //forEach {}
    println("forEach {}")
    val numbers = listOf(1,2,3,4,5)
    numbers.forEach {println(it)}

    println("forEach()")
    numbers.forEach(::println)

    println("forEachIndexed {}")
    numbers.forEachIndexed { index, value -> println("$index: $value")  }
    println("forEachIndexed()")
    numbers.forEachIndexed() {
        index, value -> println("$index: $value")
    }
    //until and in
    println("until and in")
    for(l in 1 until 5) {
        println(l)
    }

    //only in with if statement
    println("in with if statement")
    val range = 1..5
    val number2 = 3
    if(number2 in range) {
        println("$number2 is in range $range")
    } else {
        println("$number2 is not in range $range")
    }


}
