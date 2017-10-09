package trycatch

/**
 * Created by bhavdip on 10/8/17.
 */
fun main(args:Array<String>){

    var name = "Bhavdip"

    var number : Int = try{
            name.toInt()
    }catch (e: Exception){
        0
    }
    println(number)

}