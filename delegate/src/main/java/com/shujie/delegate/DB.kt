package com.shujie.delegate

/**
 * @description:
 * 委托
 *
 * @date: 2022/11/27
 * @author: linshujie
 */
interface DB {
    fun save()
}

class SqlDB : DB {
    override fun save() {
        println("save to SqlDB")
    }
}

class MySqlDB : DB {
    override fun save() {
        println("save to MySqlDB")
    }
}

class OracleDB : DB {
    override fun save() {
        println("save to OracleDB")
    }
}

/**
 * 将接口的实现委托给参数db
 */
class ActionCreateDb(db: DB) : DB by db

fun main() {
    ActionCreateDb(SqlDB()).save()
    ActionCreateDb(MySqlDB()).save()
    ActionCreateDb(OracleDB()).save()
}