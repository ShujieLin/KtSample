package com.shujie.base.lambda

/**
 * @date: 2022/12/10
 * @author: linshujie
 */
/**
 * @Date: 2022/12/10
 * @Author: linshujie
 */
class HigherFun2 {
}

fun main() {
    loginEngine("shujie","123456")
}

private fun loginEngine(userName: String, userPwd: String) {
    loginCheck(userName, userPwd) { name, pwd ->
        if (name == "shujie" && pwd == "123456") {
            println("login success")
        } else {
            println("login failure")
        }
    }
}

fun loginCheck(userName: String, userPwd: String, checkResult: (String, String) -> Unit) {

    if (userName.isEmpty() || userPwd.isEmpty()) return

    checkResult(userName,userPwd)
}
