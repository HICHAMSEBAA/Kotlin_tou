fun main(){

    // map exmpel
    val items = listOf("hicham sebaa","akram beghami","mohamed ouchen","wassime oumaroche")
    val result = items.map {
        val sub_list = it.split(" ")
        sub_list[0].substring(0,1)+sub_list[1].substring(0,1)
    }
    println(result)
    println("_____________________________________________")
    val items1 = listOf("hicham sebaa","akram beghami","mohamed ouchen","wassime oumaroche")
    val result1 = items1.map { it.substring(0,1).uppercase() + it.substring(1,it.length) }.reversed()
    println(result1)
    println("_____________________________________________")
    val items2 = listOf("hicham sebaa","akram beghami","mohamed ouchen","wassime oumaroche")
    val result2 = items2.map {
        val sub_list = it.split(" ").map {
            it.substring(0,1).uppercase() + it.substring(1,it.length)
        }
        sub_list[0]+" "+sub_list[1]
    }.reversed()
    println(result2)
    println("_____________________________________________")
    val items3 = listOf(1,2,3,4,5,6,7,8)
    val result3 = items3.map { it * 2 }
    println(result3)

    // Flatten exmpel
    println("_____________________________________________")
    val l1 = listOf("hicham","akram","mohamed","wassime")
    val l2 = listOf("sebaa","beghami","ouchen","oumaroche")
    val l3 = listOf("koko","java","kotlin","php")
    val l_total = listOf(l1,l2,l3)
    println(l_total)
    println(l_total.flatten())
}