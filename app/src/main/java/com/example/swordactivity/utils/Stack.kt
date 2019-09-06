package com.example.swordactivity

import android.util.Log
import android.widget.Toast
import java.util.*

class Stack(size: Int) {
    var size = size
    var elements = arrayOfNulls<Any>(size)
    var top = -1

    fun pop(): Any? {
        return if (top >= 0) {
            Log.e("测试测试","出栈$top")
            val temp = elements[top]
            elements[top] = null
            top--
            temp
        } else {
            Log.e("测试测试","到底了")
            null
        }
    }

    fun push(x: Any) {
        if (top < size - 1) {
            top++
            elements[top] = x
            Log.e("测试测试","入栈$top")
        }else{
            Log.e("测试测试","栈满了")
        }
    }
}