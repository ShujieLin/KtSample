package com.shujie.coroutine

import kotlinx.coroutines.*

/**
 * 运⾏不能取消的代码块
 * 在前⼀个例⼦中任何尝试在 finally 块中调⽤挂起函数的⾏为都会抛出
CancellationException，因为这⾥持续运⾏的代码是可以被取消的。通常，这并不是⼀
个问题，所有良好的关闭操作（关闭⼀个⽂件、取消⼀个作业、或是关闭任何⼀种通信
通道）通常都是⾮阻塞的，并且不会调⽤任何挂起函数。然⽽，在真实的案例中，当你
需要挂起⼀个被取消的协程，你可以将相应的代码包装在 withContext(NonCancellable)
{……} 中，并使⽤ withContext 函数以及 NonCancellable 上下⽂
 * @author  linshujie
 */
class Sample6_5 {
}

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("job:i am sleeping $i ...")
                delay(500L)
            }
        } finally {
            withContext(NonCancellable) {
                println("job:i am running finally")
                delay(1000L)
                println("job:And I've just delayed for 1 sec because I'm non-cancelable")
            }
        }
    }
    delay(1300L)
    println("i am tired of waiting!")
    job.cancelAndJoin()
    println("main:now i can quit")
}
