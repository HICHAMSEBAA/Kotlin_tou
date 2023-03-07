fun main() {
    val Hicham = Persone("HCIHAM",23, "Kotlin Devloper")
    println(Hicham.hashCode())
    println("Hicham to string() :" +Hicham.toString())
    Hicham.Display()
    // Copy object
    val Hicham2 = Hicham.copy()
    println(Hicham2.hashCode())

    val Hicham3 = Persone("HCIHAM",25, "Devloper")
    // eqauls methode
    println(Hicham.equals(Hicham2))
    println(Hicham.equals(Hicham3))
    println(Hicham3.hashCode())
    //println(Hicham.toString())
    //println(Hicham.toString())
    // destructuring declarations
    val (name,age,job) = Hicham
    println("""
    Information About :$name 
    Age : $age
    Job : $job
    """)

    val sebaa = Persone2("sebaa",22,"manager")
    println("sebaa :" + sebaa.hashCode())
    println("sebaa to string():" + sebaa.toString())
    println("sebaa test :" + sebaa.equals(Hicham))

}


data class Persone(val name: String,val age: Int, val job: String){

    fun Display(){
        println("my name is $name and I have $age years old ,my job is $job")
    }


}

class Persone2(val name: String,val age: Int, val job: String){

    fun Display(){
        println("my name is $name and I have $age years old ,my job is $job")
    }


}