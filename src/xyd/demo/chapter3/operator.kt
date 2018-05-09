package xyd.demo.chapter3

/**
 * ----------------------------------
 * Created by xyd on 2018/5/9.
 * <p/>
 * 描  述：
 *
 * 新增的操作符
 * 1. is !is as  as?
 * 2. ?  ?.  !!  ?:
 *
 * <p/>
 * 修订历史:
 * ----------------------------------
 */

fun doc(): Unit {
    //3.1     is  !is  as   as?
    /**
     * is 相当于java中的  instanceof  运算符.  !is 反之，这里会引入智能转换的概念，见第一章
     *
     * as   强制类型转换,这里 Int 和 String 不能互转。
     * as?  安全的类型转换，  配合 ?.   ?=  等使用。 var b ?= a as? String. 如果使用 as? 转换失败会返回 null
     * ?.   如果调用变量为null，则直接返回 null，而不会空指针异常
     */

    // 3.2   ?   ?.   !!  ?:   新增的null机制，有效避免空指针，且避免大量的空指针判断
    /**
     * Null 机制，就是把变量分为可空变量和不可空变量。
     *  非空变量，不能赋值为null
     *  可空变量，可以赋值为空，但是不能直接使用，通过非空判断 ?.  !!. 使用
     *
     *
     * ?    可空变量    var price: String?
     *
     * ?.   安全调用符  var result = age?.toInt 相当于 var result = if(age!=null) age.toInt() else null
     *
     * !!.  非空断言(不推荐使用)    当使用该符号的变量为null时候，会抛出nullPointerException异常
     *
     * ?:   (Elvis操作符)，当使用安全调用符时，如果变量为null，可以指定调用方法的默认返回值。
     *    val result = age?.toInt() ?: 0
     *    val result = age?.toInt() ?: throw NumberFormatException()
     */


}

fun main(args: Array<String>) {

    val a = 5

    println((a as? String)?.length ?: 0)
    println((a as? String)?.length ?: throw NumberFormatException("cuola"))


}


