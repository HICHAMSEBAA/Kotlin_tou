import kotlin.properties.Delegates

class Zoo(private val name: String,private val sound: String){
    var zoo_name: String = ""
    var id: Int = 0
    fun display(){
        println("Information about this ZOO")
        println("Name is   : ${this.zoo_name}")
        println("ID ZOO is : ${this.id}")
    }
    inner class Animel{
        fun animel(){
            println("===== information about this animel =====")
            println("This Animel is $name ")
            println("This is Sound $sound")
            println("--> ZOO info : name : $zoo_name, ID : $id")
        }
    }
    inner class Animel2{
        fun animel2(){
            println("====== information about this animel ======")
            println("This Animel is $name ")
            println("This is Sound $sound")
            println("--> ZOO info : name : $zoo_name, ID : $id")
        }
    }
}
fun main(){
    var z = Zoo("Rooster","cococo")
    z.zoo_name = "zooo parcke"
    z.id = 100023332
    z.display()
    var A = Zoo("Rooster","cococo").Animel()
    A.zoo_name = "zooo parcke"
    A.id = 100023332
    A.animel()
    var A2 = Zoo("Rooster","cococo").Animel2()
    A2.zoo_name = "zooo parcke"
    A2.id = 100023332
    A2.animel2()


}