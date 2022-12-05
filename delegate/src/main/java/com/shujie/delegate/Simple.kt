package com.shujie.delegate

import kotlin.reflect.KProperty

/**
 * @description:
 *
 * @date: 2022/11/29
 * @author: linshujie
 */

private operator fun String.setValue(item: Item, property: KProperty<*>, s: String) {
    TODO("Not yet implemented")
}

private operator fun String.getValue(item: Item, property: KProperty<*>) =
    this + "edited！"//这里的this指的是String本身

class Item {
    var version1: String = "VERSION1"
    var version2: String by version1

}
fun main() {
    val item = Item()
    println(item.version2)
}