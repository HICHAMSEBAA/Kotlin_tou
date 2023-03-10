import kotlin.reflect.typeOf

fun main(){
    val str = arrayOf("Java","Kotlin","Php")
    val cha = charArrayOf('a','b','c','d')
    val int = intArrayOf(2,1,4,3,6,4,5,)
    println("String Array :")
    str.forEach { print("$it ") }
    println()
    println("Int Array :")
    int.forEach { print("$it ") }
    println()
    println("Char Array : ")
    println(cha.lastIndex)
    cha.forEach { print("$it ") }
}

