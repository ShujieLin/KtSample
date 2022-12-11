package com.shujie.base

/**
 * @Date: 2022/12/11
 * @Author: linshujie
 */
class RepeatSample {
}

fun main() {
    repeat(10) {
        print("index = $it ")
    }
    println()

    myRepeat(10) {
        print("index = $it ")
    }
    println()

    10.myRepeat2 {
        print("index = $it ")
    }
    println()
}

inline fun Int.myRepeat2(function: (Int) -> Unit) {
    for (item:Int in 0 until this) function(item)
}

inline fun myRepeat(count: Int, function: (Int) -> Unit) {
    for (item: Int in 0 until count) function(item)
}