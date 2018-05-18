package xyd.demo.chapter7

/**
 * ----------------------------------
 * Created by xyd on 2018/5/15.
 * <p/>
 * 描  述：
 * 7.1 区间（Ranges）  只能存储简单数据类型。
 *      kotlin只支持闭区间、左开右闭。
 *
 *      闭区间生成
 *      生成方式1：IntRange\LongRange\CharRange
 *      IntRange(start: Int ,endInclusive: Int)
 *      LongRange()
 *      CharRange()
 *
 *
 *      生成方式2：rangeTo
 *      val range1 = start.rangeTo(end)
 *
 *      生成方式3：..
 *      val range3 = 1..9
 *
 *      生成方式4： 中缀函数 until
 *      val range4 = 1 until 10
 *
 * 7.2 集合 Collectios 概述
 *
 *     分为三种类型： List  Set  Map (不可写)
 *                   MutableList MutableSet MutableMap(可写)
 *
 *
 * 7.3 List
 *      四种方法创建list集合
 *      1. List(size : Int , init ：(index: Int)-> T) : List<T>
 *      2. listOf(vararg element: T) : List<T>
 *      3. arrayListOf(vararg elements : T) : ArrayList<T>
 *      4. mutableListOf(vararg elements : T) : MutableList<T>
 *
 *     方法： toMutableList (转化为可写的list)，经过验证好像没什么用。
 *
 *          增： add, addAll(可以是数组或集合) ;
 *          删: remove ,removeAt, removeAll
 *          改: public operator set(index :Int, element : E) ：E
 *          // 这里的operator是什么意思？操作符重载（？？？）
 *          查: 通过下标 list[0]； get(0)； getOrNull(10) 如果存在就返回元素，不存在就返回null
 *              contains(element :T): Boolean
 *              containsAll
 *              indexOf()
 *              lastIndexOf()
 *              list.size
 *              list.count()
 *
 *          集合变化操作：slice(IntRange); subList(startIndex,end); drop(num); dropLast(num)
 *          异常： IndexOutOfBoundException
 *
 *     遍历： 普通for、 for循环 withIndex 、 for循环 解析结构
 *
 *
 * 7.4 set
 *
 *
 *
 * <p/>
 * 修订历史:
 * ----------------------------------
 */

val range4: IntRange = 1 until 10

fun main(args: Array<String>) {
    //doListTest()

    val set = setOf("a", "b", "c", "a")
    println(set)

}

private fun doListTest() {
    val list1 = List(2, { it * 3 })  // 这里是使用 Lambda 表达式
    list1.toMutableList().add(6)
    println(list1)

    val list2 = listOf("a", "b", "c")
    println(list2)

    val list3 = arrayListOf(1, 2, 3)
    println(list3)

    val list4 = mutableListOf("a", 2, "b")
    println(list4)

    //    for (withindex in list4.withIndex()){
    //        println("${withindex.index} -> ${withindex.value}")
    //    }

//    for ((index ,value) in list4.withIndex()){
//        println("${index} -> ${value}")
//    }
    println("-----------------------------------")

    val list = mutableListOf(1, 2, 3)
    list.add(4)
    println(list)

    list.addAll(arrayOf(5, 6))
    println(list)
}


