package com.shujie.delegate

/**
 * @description:
 *
 * @date: 2022/11/28
 * @author: linshujie
 */
class LazyLoad {

}

fun requestDownload() : String{
    Thread.sleep(2000L)
    return "download successful!"
}

/**
 * 懒加载，没有值的情况，会加载requestDownload方法获取值，当有值的情况，直接返回值
 */
val responseData : String by lazy { requestDownload() }

fun main() {
    println("init...")
    Thread.sleep(3000L)
    println("begin to request")
    println(responseData)
    println(responseData)
    println(responseData)
}