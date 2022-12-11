package com.shujie.base

/**
 * DSL(domain special language 特定领域语言)
 * 例如：JSON Gradle anko等
 * @Date: 2022/12/11
 * @Author: linshujie
 */
class DSLSample {

}

fun main() {
    layout {
        button {

        }
        text {

        }
    }
}

fun layout(function: Helper.() -> Unit) {

}

fun text(function: () -> Unit) {
}

fun button(function: () -> Unit) {

}


class Helper

fun Helper.button(function: () -> Unit) {

}

fun Helper.text(function: () -> Unit) {

}