package com.shujie.base

/**
 * @Date: 2022/12/10
 * @Author: linshujie
 */
class letSample {

}

var lenght: Int = "test".myLet {
    it.length
}

/**
 * (I) this
 * I.() it
 */
private inline fun <I, O> I.myLet(lambda: (I) -> O): O = lambda(this)