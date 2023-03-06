enum class Direction {
    NORTH,
    SOUTH,
    WEST,
    EAST
}

enum class Color(val rbg: Int) {
    RED(0xFF0000) {
        override fun RGB_COLOR() = 0xFF0000
    },
    GREEN(0x00FF00) {
        override fun RGB_COLOR() = 0x00FF00
    },
    BLUE(0x0000FF) {
        override fun RGB_COLOR() = 0x0000F
    };

    abstract fun RGB_COLOR(): Int
}

enum class ProtocolState {

    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState

}













