package xyd.demo.chapter6

import kotlin.reflect.KProperty

/**
 * ----------------------------------
 * Created by xyd on 2018/5/14.
 * <p/>
 * 描  述：
 * 6.1  扩展函数
 *      定义 :
 *      fun AnyClass.functionName(params) : receiverType{
 *          method body
 *      }
 *      说明：     AnyClass 任意类
 *                functionName 拓展函数的函数名
 *                params 拓展函数的参数
 *                receiverType 拓展函数的返回值类型
 *                method body 拓展函数的方法体
 *
 *      拓展函数注意：
 *          父类和子类有相同方法的时候，由变量的当前类型决定。
 *          针对成员函数和拓展函数的同名问题，遵循成员函数优先的原则。
 *
 *
 *      拓展属性：
 *      格式：
 *          val/var Anyclass.propertiesName: propertiesType
 *          getter
 *          setter
 *
 *      拓展函数、拓展属性编译技巧：
 *      ex 自动提示
 *
 * 6.2 委托
 *
 *  (1)类委托定义：
 *      interface IWash { fun wash() {} }
 *      class BigSon : IWash {
 *          override fun wash() {
 *          println("洗碗")
 *          }
 *      }
 *      class SmallFather(var iWash: IWash) : IWash by iWash
 *  类委托使用：
 *      val bigSon = BigSon()
 *      val smallFather = SmallFather(bigSon)
 *      println("叮嘱大头儿子去洗碗")
 *      smallFather.wash()
 *      println("检查有没有洗干净")
 *
 *  (2) 属性委托：
 *      委托属性，指的是一个类的某个属性不是在类中直接定义，而是将其委托给一个代理类，
 *      从而实现对该类的属性统一管理。
 *
 *      语法结构：
 *      val/var <propertyname>: <Type> by <expression>
 *
 *      class BigSon {
 *          var 压岁钱: Int by SmallFather()
 *      }
 *
 *      在代理类中，一定要重写get和set方法. 且要用 operator 关键字修饰
 *
 *
 *  6.3 Kotlin 中 5 大内置委托
 *
 *
 * <p/>
 * 修订历史:
 * ----------------------------------
 */


class BigSon {
    var 压岁钱: Int by SmallFather()
}

class SmallFather {

    var 儿子压岁钱: Int = 0
    operator fun getValue(bigSon: BigSon, property: KProperty<*>): Int {
        println("小头爸爸的getValue方法被调用，获取当前修改的属性名称：${property.name}")
        return 儿子压岁钱
    }

    operator fun setValue(bigSon: BigSon, property: KProperty<*>, value: Int) {
        println("小头爸爸的setvalue方法被调用，获取当前修改的属性名：${property.name}、属性值${value}")
        儿子压岁钱 = value
    }

}

fun main(args: Array<String>) {
    val bigSon = BigSon()
    println("1. 小头爸爸给大头儿子100的压岁钱---------")
    bigSon.压岁钱 = 100
    println("2. 大头儿子花了50--------")
    bigSon.压岁钱 -= 50

}