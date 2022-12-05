package com.shujie.ktsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


operator fun TextView.provideDelegate(value: Any?,property: KProperty<*>) = object :ReadWriteProperty<Any?,String?>{
    override fun getValue(thisRef: Any?, property: KProperty<*>): String? = text as String?


    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String?) {
        text = value
    }

}
class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}