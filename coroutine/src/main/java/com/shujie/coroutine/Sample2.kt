package com.shujie.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * A coroutineScope builder can be used inside any suspending function to perform
    multiple concurrent operations.
 * @author  linshujie
 */
fun main() = runBlocking {
    doWorld()
    println("done")
}

private suspend fun doWorld() = coroutineScope{
    launch {
        delay(2000L)
        println("world2!")
    }

    launch {
        delay(1000L)
        println("world1!")
    }
    println("hello")
}
