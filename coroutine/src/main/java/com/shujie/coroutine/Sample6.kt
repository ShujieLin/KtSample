package com.shujie.coroutine

import kotlinx.coroutines.*

/**
 * 取消是协作的
    协程的取消是 协作 的。⼀段协程代码必须协作才能被取消。 所有 kotlinx.coroutines
    中的挂起函数都是 可被取消的 。它们检查协程的取消， 并在取消时抛出
    CancellationException。 然⽽，如果协程正在执⾏计算任务，并且没有检查取消的话，
    那么它是不能被取消的，就如如下示例代码所示：
 * @author  linshujie
 */
class Sample6 {
}

/**
 * 运⾏示例代码，并且我们可以看到它连续打印出了“I'm sleeping”，甚⾄在调⽤取消后，
    作业仍然执⾏了五次循环迭代并运⾏到了它结束为⽌。
 */
fun main() = runBlocking{
    val startTime = System.currentTimeMillis();
    val job = launch(Dispatchers.Default){
        var nexPrintTime = startTime
        var i = 0
        while (i < 5){
            if (System.currentTimeMillis() >= nexPrintTime){
                println("job : I am sleeping ${i++} ")
                nexPrintTime += 500L
            }
        }
    }
    delay(1300L)
    println("main:I am tired of waiting")
    job.cancelAndJoin()//取消⼀个作业并且等待它结束
    println("main: now i can quit")
}
