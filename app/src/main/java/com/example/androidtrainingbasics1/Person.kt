package com.example.androidtrainingbasics1

open class Person(val name : String , var age : Int) : AndroidTraining {
    override fun play() {
        println("Play")
    }

    override fun run() {
        println("Run")

    }

}

class Employee(name: String, age: Int) : Person(name, age){
    lateinit var EID : String
}