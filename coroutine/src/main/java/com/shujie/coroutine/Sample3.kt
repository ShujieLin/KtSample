package com.shujie.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * A launch coroutine builder returns a Job object that is a handle to the launched
coroutine and can be used to explicitly wait for its completion. For example, you can
wait for completion of the child coroutine and then print "Done" string:
 * @author  linshujie
 */
class Sample3 {
}

fun main() = runBlocking {
    val job = launch {
        delay(1000L)
        println("world!")
    }
    println("hello")
    job.join()
    println("done")
}