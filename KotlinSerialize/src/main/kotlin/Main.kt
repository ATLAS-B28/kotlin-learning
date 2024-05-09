package org.example

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import java.io.Serial

/*import com.google.gson.Gson

fun main() {
    val gson = Gson()
    val user = User("Aditya",21)
    val json = gson.toJson(user)
    println(json)
    val decodedUser = gson.fromJson(json, User::class.java) //deserialize JSON to object (User)
    println(decodedUser)
}

data class User(val name: String, val age: Int)
*/

data class User (
    @SerializedName("name") val userName: String,
    @SerializedName("age") val userAge: Int,
    @SerializedName("email") val userEmail: String,
    @SerializedName("address") val userAddress: Address
) {
    data class Address(
        @SerializedName("street") val street: String,
        @SerializedName("city") val city: String,
        @SerializedName("state") val state: String,
        @SerializedName("zip") val zip: String
    )
}

fun main() {
    val gson = Gson()
    //serialization
    val user =User(
        userName = "Aditya Bhambere",
        userAge = 21,
        userEmail = "adityacbhambere28@gmail.com",
        userAddress = User.Address(
            street = "123 Main St",
            city = "New York",
            state = "NY",
            zip = "100001"
        )
    )
    val json = gson.toJson(user)
    println(json)
    val dejson = gson.fromJson(json, User::class.java)
    println(dejson) //User()
    //deserialization
    val jsonData = """
        {
         "name": "Abhijeet Bhambere",
         "age": 29,
         "email": "abhijeetbhambere@gmail.com",
         "address": {
           "street": "456 Elm St",
           "city": "San Francisco",
           "state": "CA",
           "zip": "94102"
         }
        }
    """

    val decodedUser = gson.fromJson(jsonData, User::class.java)
    println(decodedUser) //User()
}