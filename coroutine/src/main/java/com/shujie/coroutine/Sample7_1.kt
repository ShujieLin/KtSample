package com.shujie.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

/**
 * 超时
 * @author  linshujie
 */

fun main() = runBlocking{
    val result = withTimeoutOrNull(1300L){
        repeat(1000){i ->
            println("i am sleeping $i")
            delay(500L)
        }
    }
    println("result is $result")
}