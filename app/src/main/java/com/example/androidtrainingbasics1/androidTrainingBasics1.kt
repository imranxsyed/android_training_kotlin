package com.example.androidtrainingbasics1

import java.util.*

lateinit var lFoo : String

fun main(){

   /************ Variables **************/
//    val one  = 1
//    var two  = 2
//    two = 3
//    two = 4
//
//
//
//
//    val integer  = 1
//    val double = 2.0
//    var string = "string"
//    var long = 1L


//
//    val foo : Int = 2
//    val foo2 : String = "String"

//    val color : String? = null
////    color  = "blue"
//    var color2 : String? = null
//    if (color2 != null){
//        color2!!.toInt()
//    }



//
//    lFoo = "Jon Wick"
//    lFoo = "X-men"


    var mAny :  Any
    mAny = "String"
    mAny = 1
    mAny = 2L

//    mAny as String
//    if (mAny is String){
//
//    }
//    else if(mAny is Int){
//
//    }
//
//    if (mAny is Float){
//        (mAny as Float).toString()
//    }
//    else if (mAny is String){
//        println(mAny)
//    }
//    else{
//        println("ELse condition")
//    }
//

    /************ Variables - ENDS **************/


    /************ list - Starts **************/
//    val mList : MutableList<Int>
//    mList = mutableListOf(1,2,3,4,5)
//    mList[0]
//    mList.add(1)
//    mList.removeAt(1)
//
//    val jo = "String"
//
//
    val list : List<Int>
    list = listOf(1,2,3,4)

//    list.forEach {myNumber->
//        println(myNumber)
//    }

//    for (i in list){
//        println(i)
//    }

//    for (i in list.indices - 1){
//        println(list.get(i))
//        println(list[i])
//    }

//   for (i in 0..list.size -1 ){
//
//   }

    //LOOPS
    //while
    //in
    //indices
    //range


    /********** Functions **************/
    //<private/public> fun <name_of_function>(.....): <Return Type>
//    println(publicFunction(2))
//    println(multiplyByTwo(3))

    /******** Functions - ENDS ******/

    /******* Higher Order Function *******/
    //multiply by two
    //modfiy list

//    var mList = mutableListOf<Int>(1,2,3,4)
//    mList = modifyList(mList, ::multiplyByTwo)
//    mList.forEach {
//        println(it)
//    }

    /******* Higher Order Function - Ends*******/


    /******** SCOPE FUNCTION *********/
//    val cal  = Calendar.getInstance()
//    cal[Calendar.MONTH] = - 1
//    cal[Calendar.YEAR] = - 1
//    cal[Calendar.DAY_OF_MONTH] = - 1
//
//    Calendar.getInstance().also {mCal->
//        mCal[Calendar.MONTH] = - 1
//        mCal[Calendar.YEAR] = - 1
//        mCal[Calendar.DAY_OF_MONTH] = - 1
//    }
//
//    val str  : String? = null
//    str?.let {
//
//    }

    /***** CLASSES AND INTERFACES ********/
//    val imran = Person("Imran", 20)
//    println(imran.name)
//    println(imran.age)
//
//    val secondPerson = Employee("Imran", 20).also { it.EID ="0000" }

    /***** CLASSES AND INTERFACES - ENDS ********/




}

fun publicFunction(number : Int): Int{
    return number
}

private fun  multiplyByTwo(number:Int): Int{
    return number * 2
}

fun modifyList(list : MutableList<Int>, nameOfFun : (Int) -> Int): MutableList<Int>{
    val output = mutableListOf<Int>()
    list.forEach {
        val newNumb = nameOfFun.invoke(it)
        output.add(newNumb)
    }
    return output
}

