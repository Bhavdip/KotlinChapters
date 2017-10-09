package FunctionExpression

/**
 * Created by bhavdip on 10/8/17.
 */

fun main(args: Array<String>){

    var result = addTwoNumber(10,100)

    println(result)

    var maxResult = maxNumberFinding(10,11)

    println(maxResult)
}

/*fun addTwoNumber(a: Int, b: Int) : Int{
    return a+b
}*/

fun addTwoNumber(a: Int, b: Int):Int = a+b

fun maxNumberFinding(a : Int, b : Int) : Int{
    if(a >b)
        return a
    else
        return b
}