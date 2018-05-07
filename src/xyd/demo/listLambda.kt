package xyd.demo

fun main(args: Array<String>) {
    val fruits = listOf("apple", "banana", "pear", "grape", "mango")
    fruits.filter {it.startsWith("a")}
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}