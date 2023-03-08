abstract class Person_info(){

    private var id: Int = 0
    fun set_id(ID:Int){
        this.id = ID
    }
    fun get_id():Int = this.id
    private var ferstname: String = ""
    fun set_ferstname(Fname:String){
        this.ferstname = Fname
    }
    fun get_ferstname():String = this.ferstname
    private var lastname: String = ""
    fun set_lastname(Lname:String){
        this.lastname = Lname
    }
    fun get_lastname():String = this.lastname
    private var age: Int = 0
    fun set_age(AGE:Int){
        this.age = AGE
    }
    fun get_age():Int = this.age

    abstract fun display()

}

class Teacher(val specialt: String, val work_experience: Int):Person_info(){
    override fun display() {
        println("----- Persone Information -----")
        println("     ID     : "+super.get_id())
        println(" First Name : "+super.get_ferstname())
        println(" Last Name  : "+super.get_lastname())
        println("    Age     : "+super.get_age())
        println("----- Information Work -----")
        println(" Specialt   : ${this.specialt}")
        println(" Experience : ${this.work_experience} Years")
    }
}

fun main(){
    val jake = Teacher("maht teacher",18)
    jake.set_id(199923302)
    jake.set_ferstname("Jake")
    jake.set_lastname("Mohannsde")
    jake.set_age(44)
    jake.display()
}