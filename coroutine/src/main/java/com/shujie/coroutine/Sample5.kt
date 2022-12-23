package com.shujie.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 取消协程的执⾏
    在⼀个⻓时间运⾏的应⽤程序中，你也许需要对你的后台协程进⾏细粒度的控制。 ⽐如
    说，⼀个⽤户也许关闭了⼀个启动了协程的界⾯，那么现在协程的执⾏结果已经不再被
    需要了，这时，它应该是可以被取消的。 该 launch 函数返回了⼀个可以被⽤来取消运
    ⾏中的协程的 Job：
 * @author  linshujie
 */
class Sample5 {
}


fun main() = runBlocking {
    val job = launch {
        repeat(1000) { i ->
            println("job:i am sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L)
    println("main:I am tired of waiting")
    job.cancel()
    job.join()
    println("main:now i can quit")
}