open class Person {
    var id: Int = 0
    var firstname: String = ""
        get() = field.uppercase()
    var lastname: String = ""
        get() = field.uppercase()
    var age: Int = 0


    fun persone_info(){
        println("----- Persone Information -----")
        println("     ID     : $id")
        println(" First Name : $firstname")
        println(" Last Name  : $lastname")
        println("    Age     : $age")
    }

}
class Doctor(val specialt: String,val work_experience:Int): Person(){
    fun Display(){
        persone_info()
        println("----- Information Work -----")
        println(" Specialt   : $specialt")
        println(" Experience : $work_experience Years")
    }
}

fun main() {

    val john = Doctor("Throat doctor",11)
    john.id = 12002321
    john.firstname = "john"
    john.lastname  = "sokaer"
    john.age = 39
    john.Display()

}