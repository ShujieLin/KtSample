package com.shujie.delegate

/**
 * @description:
 *
 * @date: 2022/11/28
 * @author: linshujie
 */
class DelegateAttribute {
    /**
     * 属性委托
     */
    var data = "data"
        get(){
            return field
        }
        set(value) {
            field = data
        }

    //v1.0版本
    var responseData :String = "are you ok?"
    //v2.0版本，调用responseInfo的时候，会调用responseData，
    var responseInfo : String by :: responseData



}