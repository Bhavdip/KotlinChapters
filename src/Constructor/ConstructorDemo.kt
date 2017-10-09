package Constructor

/**
 * Created by bhavdip on 10/9/17.
 */

class Human constructor(paramName : String="Kishan")
{

    var age : Int = 0
    var name : String = paramName
//
//    init {
//        name = paramName
//        println("We get a parameters")
//    }


    constructor(age : Int, name : String) : this(name){
         this.age = age
         this.name = name
    }

    fun think(){
        println("W have create a human..$age with the name $name")

    }
}

fun main(args:Array<String>){

    var humanObject = Human(10, "Bhavdip")
    humanObject.think()
}