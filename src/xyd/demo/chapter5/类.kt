package xyd.demo.chapter5

/**
 * ----------------------------------
 * Created by xyd on 2018/5/10.
 * <p/>
 * 描  述：
 *
 * 5.1 类方法、类属性的定义：
 *      (1).可以使用 public(默认) private protected 修饰
 *      (2). kt 默认实现public的get、set方法
 *      注：可以直接复制 java 代码，到 kt 中，idea会自动转化。
 *
 * 5.2 类创建，类方法、属性的访问
 *      (1) 类的创建，不需要new
 *      (2) 方法和属性直接 . 访问
 *
 * 5.3 setter getter 方法默认是public，如果不希望外部修改，可以将setter色设置成 private
 *      注意 field 关键字
 *
 * 5.4 主构函数 class Person(name: String, age: Int)
 *     (1) 可以在给主构函数设置默认参数
 *     (2) 给参数加上 var 或者 val 修饰符，就成为了成员变量，免去了定义成员变量的麻烦
 *     如：  class Person(var name:String = "小新", var age:Int = 12)
 *     这样可以调用无参函数，或者任意有参函数。减少了多个构造的繁杂
 *
 * 5.5 次构函数：两种情况
 *
 * 5.6 初始化方法
 *   init 关键字
 *
 * 5.7 嵌套类：两种
 *
 *
 * 5.8 数据类  data 关键字
 *      自动复写toString、hashCode、equals、copy、comopinentX 方法
 *
 *
 * 5.9 枚举类  印章类
 *
 *      枚举：name  ordinal
 *      枚举：自定义属性
 *      emum  class Week(val what:String, val doSomething:String){
 *          MON("周一","上班")
 *          SUn("周日","休息")
 *      }
 *
 *
 *
 *
 *
 *
 *
 *
 * <p/>
 * 修订历史:
 * ----------------------------------
 */
class Person {

    var name: String? = null
    var age: Int = 0
        get() = 18
        set(value) {
            field = value
            if (value < 14) {
                println("$value 是少年")
            } else {
                println("$value 不是少年")
            }
        }

}

fun main(args: Array<String>) {
    var person = Person()

    println("他的年龄是${person.age}")
    person.age = 58
    println("他的年龄是${person.age}")
}