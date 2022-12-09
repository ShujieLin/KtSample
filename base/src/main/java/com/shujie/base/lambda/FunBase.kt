package com.shujie.base.lambda

/**
 * 函数基础
 * @Date: 2022/12/8
 * @Author: linshujie
 */
class FunBase {
}

fun main() {


}

/**
 * 函数
 */
fun method() {}

/**
 * 是一个接收一个匿名函数的变量，这个变量可以执行这个匿名函数
 * 可以进行赋引用
 */
val methodValue = {}//匿名函数
val methodValue1 = methodValue

/**
 * "::"代表把函数变成"函数引用"
 */
val methodValue3 = ::method