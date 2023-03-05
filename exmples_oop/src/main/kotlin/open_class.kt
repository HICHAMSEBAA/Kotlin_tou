class Person {
    var id: Int = 0
    var firstname: String = ""
    var lastname: String = ""
    var age: Int = 0

}
class Person2 (id: Int,firstname: String,lastname: String,age: Int ){
    val fullname: String = firstname +" "+ lastname
        get() = field.uppercase()
    init {
        println("""
            ID         = $id
            First Name = $firstname
            Last Name  = $lastname
            Age        = $age
        """)
    }

}
class Person3 (val id: Int,val firstname: String,var lastname: String){

}

fun main() {
    var hicham = Person()
    var sebaa = Person2(1,"Hicham","Sebaa",23)
    val sebaaa = Person3(1,"hicham","sebaa")
    sebaaa.lastname = "douda"
    println(sebaa.fullname)
}