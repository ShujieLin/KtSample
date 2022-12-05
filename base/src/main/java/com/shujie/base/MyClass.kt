package com.shujie.base

/**
 * @description:
 *
 * @date: 2022/11/29
 * @author: linshujie
 */
fun main() {
    //基本类型
    val age: Int = 18;

    //函数类型
    //等价
    val method: () -> Unit = { println("hello") }
    val method2 = { println("hello") }
    val method3 = { unit: Unit ->
        println("hello")
    }

    //等价
    val method13: (String) -> Boolean = { s: String -> true }
    val method14 = { s: String -> true }
    val method15 = { s: String ->
        true
    }



    val method20 = {userName :String, userPwd:String, isLoginSuccess:(Boolean) -> Unit ->
        if (userName == "shujie" && userPwd == "123456")
            isLoginSuccess(true)
        else
            isLoginSuccess(false)
    }
    //调用
    method20("shujie","123456") { it: Boolean ->
        if (it) {
            println("login success")
        } else {
            println("login failure")
        }
    }


}
