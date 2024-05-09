package org.example


fun main() {
    println("Hello World!")
//creating a list
    val nums = listOf(1,2,3,4,5,6,7,8,9,10)
    println(nums[1])
//mutable
   val mutableList = mutableListOf<String>()
   mutableList.add("apple")
   mutableList.add("banana")
//set
   val uniqueNums = setOf(1,2,3,4,5,6,7,8,9,10)
   println(uniqueNums.size)
   //maps
   val userMap = mapOf(
       "name" to "Aditya",
       "age" to 22,
       "city" to "Pune"
   )/*
    Creates a tuple of type Pair from this and that.
    This can be useful for creating Map literals with less noise
   */
   println(userMap["name"])
//iterating over a list
    for(num in nums) {
        println(num)
    }
//check for particular value
    if(6 in nums) {
        println("6 is in nums")
    }
//filtering a set
    val filteredList = nums.filter { it > 4 }
    /*
    * Returns a list containing only elements matching the given predicate
    * */
    println(filteredList)
//transforming a list
    val doubleNums = nums.map { it * 8}
    println(doubleNums)
}