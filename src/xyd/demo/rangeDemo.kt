package xyd.demo

fun main(args: Array<String>) {
    val x = 10
    val y = 8

    if (x in 1..y+15){
        println("在")
    }


    val list = listOf("a","b","c")

    if (-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
    if(list.size in 1..9){
        println("${list.size} 在1..9之间")
    }

    if(list.size in 1..8 step 2){
        println("${list.size} 在1..8之间的第二个么")
        val oneMillion = 1_0000_0000
        println(oneMillion)

    }
}