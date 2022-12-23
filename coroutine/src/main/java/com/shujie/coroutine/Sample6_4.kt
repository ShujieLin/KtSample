package com.shujie.coroutine

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 在 finally 中释放资源
我们通常使⽤如下的⽅法处理在被取消时抛出 CancellationException 的可被取消的挂
起函数。⽐如说， try {……} finally {……} 表达式以及 Kotlin 的 use 函数⼀般在协程
被取消的时候执⾏它们的终结动作：
 * @author  linshujie
 */
class Sample6_4 {
}

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000){ i ->
                println("job:i am sleeping $i ...")
                delay(500L)
            }
        } finally {
            println("job:i am running finally")
        }
    }
    delay(1300L)
    println("i am tired of waiting!")
    job.cancelAndJoin()
    println("main:now i can quit")
}