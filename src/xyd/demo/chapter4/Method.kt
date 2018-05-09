package xyd.demo.chapter4

import java.text.SimpleDateFormat
import java.util.*

/**
 * ----------------------------------
 * Created by xyd on 2018/5/9.
 * <p/>
 * 描  述：
 * <p/>
 * 修订历史:
 * ----------------------------------
 */


fun doc(): Unit {
    // 4.1 表达式函数体
    // 当函数体只有一行的时候，可以省略大括号，直接用 = 就能表示
    // fun 函数() = 函数体

    // 4.2 命名参数
    // 书写格式  method(形参名1=实参1，形参名2=实参2 ....)
    // 这样的好处是，不用看调用方法，就知道每个参数所代表的含义，在高版本IDEA中其实已经帮我们自动显示

    // 4.3 默认参数
    /**
     * 可以给每个形参，默认一个默认实参。
     * 如果想要传入不同于默认参数的实参，可以用过命名参数指定传入的位置
     * 这样一个多参方法，可以做到同一个方法，n种不同的调用方式，减少了方法重载
     *
     * 注意：(1)如果不使用命名参数调用带有默认参数的方法，只能从头开始赋值
     *       (2)如果某一个参数使用了命名参数的使用方式，那么其他的参数也必须使用命名参数
     */

    // 4.4 可变参数   vararg
    /**
     * 像 java 中的可变参数一样，只能出现在函数的最后
     * 适用于参数个数不确定，但是参数类型一样的情况
     */

    // 4.5 顶层函数
    // kotlin 中的函数可以存在于某一个包中，而不用一定放到类中
    // 在 java 中方法必须存在于类中，不可以独立存在。
    // 调用范围： 同包中不用导包就可以调用， 不同包，需要导包

    // 4.6 嵌套函数
    // 顾名思义

    // 4.7 中缀函数

}

fun main(args: Array<String>) {

    println(reformat(unFormat = "1987.01.03 - 15-12-23"))
}

fun reformat(unFormat: String = "1970-01-01 00-00-00", temp: String = "YYYY-MM-DD hh-mm-ss"): String {


    val simpleDateFormat = SimpleDateFormat(temp)
    return simpleDateFormat.format(Date(unFormat))



}