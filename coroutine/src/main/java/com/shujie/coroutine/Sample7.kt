package com.shujie.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

/**
 * 超时
 * withTimeout 抛出了 TimeoutCancellationException ，它是 CancellationException 的⼦
类。 我们之前没有在控制台上看到堆栈跟踪信息的打印。这是因为在被取消的协程中
CancellationException 被认为是协程执⾏结束的正常原因。 然⽽，在这个示例中我们
在 main 函数中正确地使⽤了 withTimeout 。
由于取消只是⼀个例外，所有的资源都使⽤常⽤的⽅法来关闭。 如果你需要做⼀些各类
使⽤超时的特别的额外操作，可以使⽤类似 withTimeout 的 withTimeoutOrNull 函数，
并把这些会超时的代码包装在 try {...} catch (e: TimeoutCancellationException)
{...} 代码块中，⽽ withTimeoutOrNull 通过返回 null 来进⾏超时操作，从⽽替代抛
出⼀个异常：
 * @author  linshujie
 */
class Sample7 {
}

fun main() = runBlocking{
    withTimeout(1300L){
        repeat(1000){i ->
            println("i am sleeping $i")
            delay(500L)
        }
    }
}