package com.shujie.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Coroutines are less resource-intensive than JVM threads. Code that exhausts the
    JVM's available memory when using threads can be expressed using coroutines
    without hitting resource limits. For example, the following code launches 100000
    distinct coroutines that each wait 5 seconds and then print a period ('.') while
    consuming very little memory:
 * @author  linshujie
 */
class Sample4 {
}

/**
 * If you write the same program using threads (remove runBlocking , replace launch
    with thread , and replace delay with Thread.sleep ), it will likely consume too much
    memory and throw an out-of-memory error.
 */
fun main() = runBlocking{
    repeat(100_000){
        launch {
            delay(5000)
            print(".")
        }
    }
}
