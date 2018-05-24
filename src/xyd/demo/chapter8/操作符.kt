package xyd.demo.chapter8

/**
 * ----------------------------------
 * Created by xyd on 2018/5/24.
 * <p/>
 * 描  述：
 *
 * 1. if
 * 2. when
 *      两种判断方式
 *      满足第一个条件就不往下走了
 *
 *
 *
 * 3.for循环
 *
 * 4. 只有一种写法
 *      if (元素变量 in 遍历对象){}
 *
 * 5. while (条件表达式){
 *      执行语句
 *    }
 *
 *
 * 6. do{ 执行语句 } while { 条件表达式 }
 *
 * 7. break
 *      用来中断循环语句，包括while、for、do while等；
 *      单独使用，只跳出单层循环；
 *      可以通过指定循环名，跳出指定循环。
 *      循环1@ for(){
 *          循环2@ for(){
 *              break@循环名
 *          }
 *      }
 *
 *
 * 8. continue
 *      跳出本次循环值，继续下一次
 *
 * <p/>
 * 修订历史:
 * ----------------------------------
 */
fun main(args: Array<String>) {

    val intRange = 1..4
    root1@ for (i in intRange) {
        root2@ for (j in intRange) {
            if (i == j && i == 2) break@root1
            println("i = $i j = $j")
        }

    }

}