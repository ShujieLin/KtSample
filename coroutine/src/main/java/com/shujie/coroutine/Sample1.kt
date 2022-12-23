package com.shujie.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * The main difference is that the runBlocking
 * method blocks the current thread for waiting, while coroutineScope just suspends,
 * releasing the underlying thread for other usages.
 * Because of that difference,
 * runBlocking is a regular function and coroutineScope is a suspending function.
 * @author  linshujie
 */
class Sample1 {
}

fun main() = runBlocking {
    launch {
        doWorld()
    }
    println("hello")
}

private suspend fun doWorld() {
    delay(1000L)
    println("world")
}

fun main2() = runBlocking {
    doWorld()
}

private suspend fun doWorld2() = coroutineScope {
    launch {
        delay(1000L)
        println("world")
    }
    println("hello")
}