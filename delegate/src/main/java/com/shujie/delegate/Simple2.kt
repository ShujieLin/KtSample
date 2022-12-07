package com.shujie.delegate

import kotlin.properties.Delegates

/**
 * @Date 2022/12/6
 * @Author linshujie
 */
class Simple2 {
    var name :String by Delegates.observable("test"){
        property, oldValue, newValue ->
        println("old $oldValue -> new : $newValue")
    }
}

fun main() {
    val simple2 = Simple2()
    simple2.name = "version1"
    simple2.name = "version2"
}