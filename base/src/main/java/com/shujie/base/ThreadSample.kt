package com.shujie.base

import kotlin.concurrent.thread

/**
 * @Date: 2022/12/11
 * @Author: linshujie
 */
class ThreadSample {

}

fun main() {
    thread {
        println("I am thread ${Thread.currentThread().name}")
    }

    myThread {
        println("I am thread ${Thread.currentThread().name}")
    }
}

/**
 * 不能使用inline，使用inline的话需要把整个java的Thread拷贝出去，Therad太大了无法拷贝
 * crossinline 代表不能使用inline优化
 */
inline fun myThread(
    start: Boolean = true,
    name: String? = null,
    crossinline run: () -> Unit
): Thread {
    val thread = object : Thread() {
        override fun run() {
            super.run()
            run()
        }
    }
    if (start) thread.start()
    name?.let { thread.name = it }
    return thread
}