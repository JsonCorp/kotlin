package com.example.kotlin.specialclass

fun main() {
    DoAuth.takeParams("foo", "qwerty")
    DoAuth.setCount(5)

    var count = DoAuth.getCount();
    println("Object Class getCount = $count")
}

object DoAuth {                                                 //1
    var mCount = 0
    fun takeParams(username: String, password: String) {        //2
        println("input Auth parameters = $username:$password")
    }

    fun setCount(count: Int) {
        mCount = count
    }

    fun getCount(): Int {
        return mCount
    }
}