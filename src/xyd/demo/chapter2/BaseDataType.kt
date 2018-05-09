package xyd.demo.chapter2

/**
 * 变量
 * 数字类型
 * 字符
 * 布尔
 * 数组
 * 字符串
 */
fun showDoc(): Unit {
    // 2.1 kotlin 中的变量，分为两种："可变变量" var (取自 variable)；"不可变变量" val(取自 value)。
    // 可变变量可以进行多次修改。
    // 不可变变量 只能进行一次初始化。 对应 java 中的final

    // 相比于 java ，不可变类型的变量只需要 val 就可以，而不需要使用 public static final修饰

    /**
     * 如果一个变量只是声明，需要约束变量的具体类型
     *
     * 变量类型支持自动推断
     *
     * 开发中，使用 val 变量优先
     *
     * 编译后的字节码文件: val 转换成 private final
     */
    val a: Int = 100

    var b: String

    val c: Double
    c = 10.0


    // 2.2 注释和异常
    // 注释和java基本一样，多了一个多行注释的相互嵌套


    // 2.3 异常处理
    /**
     * kotlin 没有受检异常。 编译器不提示 try catch
     *
     * try 表达式可以有返回值，返回值由 try 或者 catch 的最后一行决定
     */


    // 2.4 数字类型
    /**
     *  字面常量不支持八进制。
     *
     *  数字字面值支持下划线分割，更易读。
     *
     *
     */

    // 2.5  可空表示符  ?=
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA === anotherBoxedA)


    // 2.6 显式转换   Int 和 Long 数值，是两个不同的类型，不能将 Int 值赋值给 Long 变量
    // 我们可以显式拓宽数字
    //
    // Int 值和 Long 值可以直接参加运算，结果可以从上下文推导


    // 2.7  运算符
    //    shl(bits)  – 有符号左移 (Java 的  <<  )
    //    shr(bits)  – 有符号右移 (Java 的  >>  )
    //    ushr(bits)  – 无符号右移 (Java 的  >>>  )
    //    and(bits)  – 位与
    //    or(bits)  – 位或
    //    xor(bits)  – 位异或
    //    inv()  – 位非


    // 2.8 字符
    // 用 Char 类型表示。 他们不能直接当做数字

    // 2.9 布尔  Boolean
    // ||   短路逻辑或
    // &&   短路逻辑与
    // !    逻辑非

    // 2.10 数组  Array
    // 定义了 get 和 set 函数，以及 size 属性
    //
    // 方式一：我们可以使用库函数 arrayOf() 来创建一个数组;  arrayOf(1, 2, 3) = [1,2,3]
    // 方式二：arrayOfNull() 用于创建一个空数组
    // 方式三：接收数组大小和一个函数参数的工厂函数，用做参数的函数能够返回给定索引的的每个索引的每个元素初始值
    // val asc = Array(5, { i -> (i * i).toString() })  =  [0, 1, 4, 9, 16]
    //
    // Kotlin 中数组是不型变的。也就是 Array<String>不能赋值给 Array<Any>, 以防止可能的运行时失败。
    // Kotlin 中也有无装箱开销的 ByteArray, ShortArray, IntArray 等，这些类和 Array 没有继承关系 ，但是它们有
    // 同样的属性集。也有相应的工厂方法。

    // 2.11 字符串： String 是不可变的，可以用 for 循环迭代字符串,遍历转换成一个个 Char 类型。
    // (1) 字符串可以遍历
    // (2) split 传入的参数不是正则
    // (3) 拆分支持多字符 "http://www.itcast.com.cn".split("://",".")
    // (4) 字符串截取多了好多方法      subString(".")   subStringBefor(".")  subStringBeforeLast(".")  subStringAfterLast()
    // (5) 去空格多了方法 trim()  trimStart()
    // (6) 支持三重引号，格式输出更方便： 在java的基础上，三引号内可以包含任意特殊的字符。 原格式输出，不用转义。
    // (7) 字符串模板：  格式 ${变量，函数，或表达式}  单独为变量时候，大括号可以省略

}

/**
 * 基本数据类型
 */
fun main(args: Array<String>) {

    var s1 = "a is a char"
    var s2 = "s2 = $s1"
    println(s2)
}
