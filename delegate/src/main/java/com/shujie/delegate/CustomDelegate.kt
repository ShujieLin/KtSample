package com.shujie.delegate

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @description:
 * 自定义委托
 *
 * @date: 2022/11/28
 * @author: linshujie
 */


class CustomDelegate {
    private var str: String = "defulut"
    operator fun getValue(owner: Owner, property: KProperty<*>): String {
        return str
    }

    operator fun setValue(owner: Owner, property: KProperty<*>, value: String) {
        str = value
    }
}

class Owner {
    var str: String by CustomDelegate2()
}

class CustomDelegate2 : ReadWriteProperty<Owner, String> {
    private var str2: String = "defulut"
    override operator fun getValue(owner: Owner, property: KProperty<*>): String {
        return str2
    }

    override operator fun setValue(owner: Owner, property: KProperty<*>, value: String) {
        str2 = value
    }
}

private var myName :String by UserNameDelegate()
class UserNameDelegate{
    private var name = "name"
    operator fun getValue(thisRef:Any?,property: KProperty<*>):String{
        println("getValue")
        return name
    }
    operator fun setValue(thisRef: Any?,property: KProperty<*>,value: String){
        name = value
    }
}

fun main() {
    val owner = Owner()
    owner.str = "hello"
    println(owner.str)
    owner.str = "hi"
    println(owner.str)

    println("----")
    myName = "a"
    println(myName)
}