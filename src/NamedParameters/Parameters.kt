package NamedParameters

/**
 * Created by bhavdip on 10/8/17.
 */

fun main(args: Array<String>){
    var finalAmt = calAmount(1000,0.30)

    println(finalAmt)
}

@JvmOverloads
fun calAmount(amount: Int, interestRate : Double = 0.40) : Int{
    return (amount + amount * interestRate).toInt();
}