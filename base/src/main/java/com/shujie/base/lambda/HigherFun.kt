package com.shujie.base.lambda

/**
 * 高阶函数就是函数的函数
 * 函数如果有lambda就属于高阶函数
 *
 * KT中基本上都是表达式，if else可以返回
 * Java中基本都是语句，if else不可以返回
 * @Date: 2022/12/8
 * @Author: linshujie
 */
class HigherFun {
}

fun main() {
    println(fun0(1,1))
    println(fun1(1,1)("lin","shujie"))
}
val fun0 = fun(n1: Int, n2: Int)//fun0函数
        : String
        = "shujie"

val fun1 = fun(n1: Int, n2: Int)//fun1函数
        : (String, String) -> String //fun1函数返回了这个函数
        = { str1, str2 -> "${n1} ${n2} ${str1} ${str2}" }//fun1函数实现


