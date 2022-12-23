package com.shujie.coroutine

import kotlinx.coroutines.*

/**
 * While catching Exception is an anti-pattern, this issue may surface in more subtle
ways, like when using the runCatching function, which does not rethrow
CancellationException
 * @author  linshujie
 */

fun main() = runBlocking {
    val job = launch(Dispatchers.Default) {
        repeat(5) { i ->
            try {
                println("job : I am sleeping $i ...")
                delay(500L)
            } catch (e: Exception) {
                println(e)
            }
        }
    }
    delay(1300L)
    println("main:I am tired of waiting")
    job.cancelAndJoin()//取消⼀个作业并且等待它结束
    println("main: now i can quit")
}
