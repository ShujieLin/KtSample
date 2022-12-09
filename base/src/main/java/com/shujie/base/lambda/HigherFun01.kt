package com.shujie.base.lambda

/**
 * @Date: 2022/12/8
 * @Author: linshujie
 */
class HigherFun01 {
}

fun main() {
    //相当于接口的实现
    val str: String = fun01(18) { it ->
        "${it} are u ok?"
    }
    println(str)

    fun02(1, 2, 3) { n1, n2, n3 ->
        println(n1 + n2 + n3)
        println(n1 * n2 * n3)
        println(n1 / n2 / n3)
    }
}

/**
 * 返回的是String
 * "lambda: (Int) -> String" 相相当于接口的声明
 * "lambda.invoke(num)" 相当于接口的调用
 */
fun fun01(num: Int, lambda: (Int) -> String): String = lambda.invoke(num)

/**
 * 传入三个Int，可以进行相加、相减、相除
 */
fun fun02(n1: Int, n2: Int, n3: Int, lambda: (Int, Int, Int) -> Unit) = lambda.invoke(n1, n2, n3)
