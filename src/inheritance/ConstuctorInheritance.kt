package inheritance

/**
 * Created by bhavdip on 10/9/17.
 */

open class Student(ttSubject : Int = 6) {

    var totalSubject : Int = ttSubject

    init {
        println("I am student init block")
    }

    open fun work(){
        println("I am student so I have total $totalSubject subject")
    }
}

class CollegeStudent(clSubject: Int): Student(clSubject){

    init {
        println("I am college Student init block")
    }

    /*override fun work(){
        println("I am COLLAGE student so I have total 10 subject")
    }*/

}



fun main(args: Array<String>){
    var collegeStudent = CollegeStudent(3)
    collegeStudent.work()
}