interface Named {
    val name: String
}

interface Persone1: Named{
    val fname: String
    val lname: String

    override val name: String
        get() = "$fname $lname"
}

data class  Employee(override val fname: String,override val lname: String):Persone1{}

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}