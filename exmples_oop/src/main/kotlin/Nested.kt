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



}