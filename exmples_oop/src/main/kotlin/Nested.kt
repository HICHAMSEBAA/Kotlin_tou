import kotlin.properties.Delegates

class Zoo{
    lateinit var name: String
    var id: Int = 0
    fun display(){
        println("Information about this ZOO")
        println("Name is   : ${this.name}")
        println("ID ZOO is : ${this.id}")
    }
    class Animel(private val name: String,private val sound: String){
        fun animel(){
            println("This Animel is ${this.name} ")
            println("This is Sound ${this.sound}")
        }
    }
    class Animel2(private val name: String, private val sound: String){
        fun animel2(){
            println("====== information about this animel ======")
            println("This Animel is ${this.name} ")
            println("This is Sound ${this.sound}")
        }
    }
}
fun main(){
    var z = Zoo()
    z.name = "zooo parcke"
    z.id = 100023332
    z.display()
    var A = Zoo.Animel("Rooster","cococo")
    A.animel()
    var A2 = Zoo.Animel2("Rooster","cococo")
    A2.animel2()


}