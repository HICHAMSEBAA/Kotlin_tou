import Color
fun main(args: Array<String>) {
    val color1 = Color.BLUE
    val color2 = Color.GREEN
    val color3 = Color.RED

    fun color(RGB_CODE: Int) {
        when(RGB_CODE){

            0xFF0000 -> println(Color.RED)
            0x00FF00 -> println(Color.GREEN)
            0x0000FF -> println(Color.BLUE)
        }
    }
    color(0xFF0000)

}