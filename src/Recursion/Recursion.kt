package Recursion

import java.math.BigInteger

/**
 * Created by bhavdip on 10/8/17.
 */
fun main(args:Array<String>){
//    println(fact(num = 5))

    var num = BigInteger("70000")
    println(fact(num, BigInteger.ONE))
}

fun fact(num : Int) : Int{
    if(num == 0)
        return 1
    else
        return num * fact(num - 1)

}

tailrec fun fact(num : BigInteger, result : BigInteger) : BigInteger{
    if(num == BigInteger.ZERO){
        return result
    }else{
        return fact(num - BigInteger.ONE, num*result)
    }
}