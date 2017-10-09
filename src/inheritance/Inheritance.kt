package inheritance

/**
 * Created by bhavdip on 10/9/17.
 */

open class Human{

    open fun think(){
        println("Real think")
    }
}

class Alien() : Human(){

    override fun think(){
        println("Alien real think")
    }
}

//open class Computer{
//
//}
//
//class Alien : Human(), Computer(){
//
//}

fun main(args: Array<String>){
    var human = Human()
    human.think()

    var alien : Human = Alien()
    alien.think()
}