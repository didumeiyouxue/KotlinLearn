package xyd.demo

fun main(args: Array<String>) {

    println(describe(1))
    println(describe("Hello"))
    println(describe(1L))
    println(describe(2.3))
}

fun describe(x: Any): String =

        when (x) {

            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a String"
            else -> "UnKnown"
        }
