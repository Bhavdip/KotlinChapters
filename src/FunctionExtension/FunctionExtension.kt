package FunctionExtension

/**
 * Created by bhavdip on 10/8/17.
 */

fun main(args:Array<String>){
    var val1 = Alien()
    val1.skills = "Java"
    val1.show()

    var val2 = Alien()
    val2.skills = "Kotlin"
    val2.show()

    var val3 = val1 plus  val2
    val3.show()
}

operator infix fun Alien.plus(a : Alien) : Alien{
    var newAlien : Alien = Alien() // new Alien object
    //assign new both skills here this refer val1 and a refer val2 while newAlien as newly created object
    newAlien.skills = this.skills + "," + a.skills

    return newAlien
}
