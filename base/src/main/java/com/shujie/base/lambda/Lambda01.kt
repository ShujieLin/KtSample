package com.shujie.base.lambda

/**
 * @description:
 *
 * @date: 2022/12/5
 * @author: linshujie
 */
class Lambda01 {
}

fun main() {
    //函数声明：
    val method01: () -> Unit
    val method02: (Int, Int) -> Unit
    val method03: (String, Double) -> Any
    val method04: (Int, Double, Long, String) -> Boolean
    val method05: (Int, Int) -> Int

    //函数声明 + 函数实现:
    val method06: () -> Unit = { println("method06") }
    method06()
    method06.invoke()

    val method07 = { println("method07") }
    println(method07)

    val method08 = { str: String -> println("$str") }
    method08("shujie")

    val method09 = { num1: Int, num2: Int -> num1.toString() + num2.toString() }
    println(method09(1, 1))

    //先声明，后实现:
    val method10: (Int) -> String
    method10 = fun(value: Int): String = value.toString()
    //错误用法
    /*method10 = fun(value:Int) : Boolean = value.toString()*/

    val method11: (Int) -> String
    method11 = fun(value) = value.toString()
    println(method11(1))

    //声明+实现
    val method12: (Int) -> String = { value -> "$value" }
    println(method12(100))

    val method13: (String, String) -> Unit = { str1, str2 -> println("str1:$str1,str2:$str2") }
    method13.invoke("lin", "shujie")

    val method14: (String) -> Unit = {
        println("method14 default contains argument 'it':$it")
    }
    method14("kotlin is the best")

    val method15: (Int) -> Unit = {
        when (it) {
            0 -> println("0")
            in 1..9 -> {
                println("1-9")
            }
            10 -> println("10")
        }
    }
    method15(5)

    //"_"拒收参数
    val method16: (Int, Int) -> Unit = { _, num2 ->
        println("$num2")
    }
    method16(1, 100)


    //(Any) -> Any
    val method17 = { any: Any -> any }
    println(method17(1))
    println(method17("1"))

    //给String添加匿名扩展函数
    //this == String本身 == 调用者本身 == "shujie"，相当于给String添加匿名扩展函数：以 下的fun18
    val method18: String.() -> Unit = {
        println("this is $this")
    }
    "shujie".method18()
    "shujie".fun18()

    //给Int添加匿名函数
    val method19: Int.(Int) -> String = { "${this + it}" }
    println(1.method19(1))
    println(method19(1, 1))

    val method20: Double.(Double, Double) -> Unit = { d1, d2 ->
        println("${this + d1 + d2}")
    }
    method20.invoke(1.1, 1.2, 1.3)
    1.1.method20(1.2, 1.3)

    val method21: Char.(String) -> Unit = {
        println(
            if (this == '男')
                "man!"
            else if (this == '女')
                "woman!"
            else it
        )
    }
    '男'.method21("unknown")
    'a'.method21("unknown")
}

/**
 * 扩展函数，可在项目的任何地方调用
 */
fun String.fun18() {
    println("this is $this")
}