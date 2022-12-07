package com.shujie.base.lambda

/**
 * @Date: 2022/12/6
 * @Author: linshujie
 */
class Fun01 {
}

fun main() {
    //函数，默认返回Unit
    fun fun01(): Unit {
        println(1)
    }

    //默认返回Unit
    fun fun02(): Unit {
        1
    }

    //默认返回Unit
    fun fun03(): Unit {
        "shujie"
    }

    //返回String
    fun fun04(): String {
        return "shujie"
    }

    //返回函数，()->Unit
    fun fun05() = {}

    //返回函数，()->Unit
    fun fun06() = { println("a u ok?") }
    fun06()()

    fun fun07(): String = run { ("a u ok?") }
    fun fun08(): () -> String = {
        "a u ok?"
    }
    fun07()
    fun08()()//函数返回函数

    //fun09函数返回的是函数：(Int) -> Unit
    fun fun09() =
        { n: Int -> println("the type you inputed is int? ${if (n is Int) "$n is int!" else "it is not int!"}") }
    fun09()(1)

    //(Int,Int) -> Unit
    fun fun10() = { n1: Int, n2: Int -> println("n1 plus n2 's result is ${n1 + n2}") }

    //(Int,Int) -> String
    fun fun11() = { n1: Int, n2: Int ->
        println("n1 plus n2 's result is ${n1 + n2}")
        true
        "true"
    }

    //两者等价
    val method01 = { str: String -> str.length }
    val method02: (String) -> Int = { it.length }

    //Function1<String,Int> 等价于 (String) -> Int
    val method03: Function1<String, Int> = { str: String -> str.length }
}