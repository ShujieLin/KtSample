package com.shujie.coroutine

import kotlinx.coroutines.*

/**
 * 我们有两种⽅法来使执⾏计算的代码可以被取消。第⼀种⽅法是定期调⽤挂起函数来检
查取消。对于这种⽬的 yield 是⼀个好的选择。 另⼀种⽅法是显式的检查取消状态。让
我们试试第⼆种⽅法。
将前⼀个示例中的 while (i < 5) 替换为 while (isActive) 并重新运⾏它。
 * @author  linshujie
 */
class Sample6_3 {
}

fun main() = runBlocking{
    val startTime = System.currentTimeMillis();
    val job = launch(Dispatchers.Default){
        var nexPrintTime = startTime
        var i = 0
        while (isActive){
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