package com.shujie.base.lambda

/**
 * @Date: 2022/12/10
 * @Author: linshujie
 */
class Higher3 {
}

fun main() {

    "shujie".abc {

    }
    "shujie".abc2 {
        println(it)
    }
    "shujie".abc3 {
        println(this)
    }
    "shujie".abc4 {
        println(this)
    }
}

/**
 * 给泛型增加匿名函数，this == T
 */
fun <T> T.abc(mm: () -> Unit) {
    mm()
}

fun <T> T.abc2(mm: (Int) -> Unit) {
    mm(18)
}

fun <T> T.abc3(mm: String.(Int) -> Unit) {
    //this == String == "shujie"
    "shujie".mm(18)
}

fun <T> T.abc4(mm: T.(Int) -> Unit) {
    //this == T
    this.mm(18)
 }
