package loops

import java.util.*

/**
 * Created by bhavdip on 10/8/17.
 */
fun main(args: Array<String>){

    //For reversed
//
//    var nums = 1..16
//    for(a in nums.reversed()){
//        println(a)
//    }
//
//    //until
//
//    var nums = 1 until  16
//
//    for(index in nums){
//        println(index)
//    }
//
//    //Charater rang
//    var char = 'A'..'z'
//    for(index in char){
//        println(index)
//    }


    //Listof

//    var nums = listOf(1,2,3,4,5,6)
//
//    for((k,v) in nums.withIndex()){ // this will return key and value
//        println("Key:[$k] and Value[$v]" )
//    }

    //Tree Map
    //must have to import  import java.util.*
    var customer = TreeMap<String,Int>() //Java Tree Map with kotlin
    customer["A"] = 1
    customer["B"] = 2
    customer["C"] = 3

    for((name,value) in customer){
        println("Key[$name] and Value[$value]")
    }


}