package com.example.swordactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_detail.*
import kotlin.random.Random

class DetailActivity : AppCompatActivity() {

    private val arr = Array(10) { IntArray(10) }

    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    **/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        addArray()

        btn_run.setOnClickListener { run(Random.nextInt(100, arr[9][9])) }
        var arrStr = ""
        for (i in 0..9) {
            for (j in 0..9) {
                arrStr += "  " + arr[i][j]
            }
            arrStr += "\n\r"
        }

        tv_problem.text = arrStr
    }


    private fun addArray() {
        var key = 100
        for (i in 0..9) {
            for (j in 0..9) {
                arr[i][j] = key
                key += Random.nextInt(10)
            }
        }
    }

    private fun run(k: Int) {
        var i = 9
        var j = 0
        var str = ""
        var step = 0

        while (true) {
            if (i < 0 || j > 9) {
                tv_data.text = str
                break
            }
            Log.e("测试测试", "k==$k  ,  arr[$i][$j]==" + arr[i][j])
            str += "k==$k  ,  arr[$i][$j]==" + arr[i][j] + "\n\r"
            when {
                arr[i][j] > k -> {
                    i--
                    step++
                }
                arr[i][j] < k -> {
                    j++
                    step++
                }
                else -> {
                    Log.e("测试测试", "成功i==$i   ,   j==$j  ,  arr==" + arr[i][j])
                    str += "成功      k==$k  ,  arr[$i][$j]==" + arr[i][j] + ",." + "step == $step"
                    tv_data.text = str
                    return
                }
            }
        }

    }
}