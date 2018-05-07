package xyd.demo

/**
 *
 * 1.1 基础语法
 */
fun main(args: Array<String>) {
//    println("Hello World")
//    println(sum(1, 2))
//    println("1 + 2 = ${sum2(1, 2)}")
//    printSum(2, 3)
//    printNum(9)

    // 不可变变量
    definite()
    // 可变变量
    definite2()

    // 返回值可空, 以及 Null 检测
    println(" 返回值是 ${parseInt("")}")
    useNullFun("a", "1")

}


// 1.1.1 定义函数
// (1) 两个参数，有返回值的函数
fun sum(x: Int, y: Int): Int {
    return x + y
}

// (2) 将表达式作为  函数体， 返回值类型自动推断的函数
fun sum2(x: Int, y: Int) = x + y

// (3) 函数返回毫无意义的值，类似于void
fun printSum(x: Int, y: Int): Unit {
    println("sum of $x and $y is ${x + y}")
}

// (4) 无意义的返回值申明可以省略
fun printNum(x: Any) {
    println("无意义的返回值申明可以省略")
}

// 1.1.2 定义局部变量
// (1) 一次赋值（只读）的局部变量, 类似于 final
fun definite() {
    val a: Int = 1  // 申明并赋值
    val b = 2       // 申明（不明确类型），赋值
    val c: Int      // 申明
    c = 3           // 赋值

    println("a= $a,  b = $b ,c = $c")
}

// (2) 可变变量
fun definite2() {
    var x = 5
    x++
    println("x = $x")
}

// 1.1.3 注释   // 行注释    /*  */  块注释，块注释可以嵌套
// 1.1.4 字符串模板   " a = $a"   "a = ${表达式或者函数体}"
// 1.1.5 条件表达式
/*

    //第一种使用方式和java相同
    if(a>b){
    }else{
    }

    // 第二种使用方式， 使用 if 做表达式
    // 在kotlin中 if 是一个表达式，即它会返回一个值。 因此就不需要三元运算符了。
    // 当if 用作表达式的时候，一定需要else，因为它需要返回值
    fun MaxOf(a:Int ,b: Int) = if (a>b) a else b
*/

// 1.1.6 使用可空值以及 null 检测
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun useNullFun(arg1: String, arg2: String): Unit {
    val x = parseInt(arg1)
    val y = parseInt(arg2)


    if (x == null) {
        println("x value is null")
        return
    }
    if (y == null) {
        println("y value is null")
        return
    }
    println(x * y)
}

// 1.1.7 使用类型检测 以及 自动类型转换
// is  运算检测一个表达式是否是某类型的一个实例。 如果一个不可变的局部变量已经判断出是某类型。
// 那么该结果的有效分支范围内，可以直接使用。无需显式转换。


// 1.1.8 使用 for 循环
/*
    // 两种方式
    // （1） item in Items
    //  (2)  index in Items.indices

 */


// 1.1.9 使用 while 循环
/*
    val items = listOf("apple","banana")
    val index = 0
    while(index < items.size){
        ...
        index++
    }

 */


// 1.1.10 使用 when 表达式, 配合 lambda 表达式，超级强大   类似于java中的 swith
/*
    var obj : any
    when(obj){
        1       ->   "One"
        "hello" ->   "Two"
        is Long ->   "Long"
    }

 */


// 1.1.11 使用{区间}    使用 in 运算符来检测某个数字是否在指定区间内
//  （1）区间迭代   x in 1..5
//  （2）数列迭代   x in 1..10 step2   /  x in 9 downTo 0 step 3


// 1.1.12 使用集合：
// （1）使用 in 迭代
// （2）使用 lambda 表达式来过滤和映射集合