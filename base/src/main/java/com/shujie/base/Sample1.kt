package com.shujie.delegate.base


//import javax.xml.bind.DatatypeConverter.parseInt

class Sample1 {

}


/*
fun main() {
    testRangeIn()

    *//*   //sampleStart
       val i = 10
       println("i = $i") // 输出“i = 10”
   //sampleEnd

       //sampleStart
       val s = "abc"
       println("$s.length is ${s.length}") // Prints "abc.length is 3"
   //sampleEnd

   //sampleStart
       var a = 1
       // 模板中的简单名称：
       val s1 = "a is $a"
       a = 2
       // 模板中的任意表达式：
       val s2 = "${s1.replace("is", "was")}, but now is $a"
   //sampleEnd
       println(s2)*//*


*//*
    testFor()
*//*
*//*
        testRange()
*//*

}*/


fun testFor() {
    //sampleStart
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
//sampleEnd


    //sampleStart
    val items2 = listOf("apple", "banana", "kiwifruit")
    for (index in items2.indices) {
        println("item at $index is ${items2[index]}")
    }
//sampleEnd
}

fun testWhile() {
    //sampleStart
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
//sampleEnd
}

fun testRange(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "Not a string"
    else -> "Unknown"
}

fun testRange(){
    //sampleStart
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
//sampleEnd
}

fun testRangeOut(){
    //sampleStart
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
//sampleEnd
}

fun testRangeIn() {
    //sampleStart
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
//sampleEnd
}

fun testList(){
    /*
    val items = listOf("apple", "banana", "kiwifruit")
//sampleStart
    for (item in items) {
        println(item)
    }
//sampleEnd

    //sampleStart
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
//sampleEnd
*/
    //使⽤ lambda 表达式来过滤（filter）与映射（map）集合：
    //sampleStart
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
//sampleEnd
}

fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

fun List<String>.getShortWordsTo2(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
//    shortWords += articles
    shortWords
}

fun testPrintList(){
    //sampleStart
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")
//sampleEnd
}

data class Person(var name: String, var age: Int)
fun testList2(){
    //sampleStart
    val bob = Person("Bob", 31)
    val people = listOf(Person("Adam", 20), bob, bob)
    val people2 = listOf(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)
//sampleEnd
}

fun testList3(){
    //sampleStart
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)
//sampleEnd
}

/**
 *当可能⽤ null 值时，必须将引⽤显式标记为可空。可空类型名称以问号（ ? ）结
尾。
如果 str 的内容不是数字返回 null ：
 */
fun testEmpty(str:String):Int? {
    return str.toIntOrNull()
}


/*fun testEmpty2(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    // 直接使⽤ `x * y` 会导致编译错误，因为它们可能为 null
    if (x != null && y != null) {
        // 在空检测后，x 与 y 会⾃动转换为⾮空值（non-nullable）
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}*/



fun main() {


   /* testList3()*/

    /*testPrintList()*/

    /*val words = "A long time ago in a galaxy far far away".split(" ")
    printAll(words)
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo2(shortWords, 3)
    println(shortWords)*/
}