package com.jiubang.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var a = 1
    private var b: Int = 2
    private var c: String = "129855"

    private var d: List<Int> = listOf(4, 5, 6)
    private var e: List<String> = listOf("apple", "banana", "pear")
    private var f: List<String> = listOf()
    private var g: Array<Int> = arrayOf(1,2,3,4)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_click.setOnClickListener {
            //            sum(a,b)
//            sum2(a,b,c)
//            listLoop(e)
//            tv_result.text = testWhen(a)
//            testRange(14)
//            testReturn()
//            testForeachRange()
//            testWhile(b)
//            testNull(e)
            switchNumber(a,b)

        }

    }

    //求和
    private fun sum(a: Int, b: Int) {
        tv_result.text = "${a + b}"
        println("a=$a 和 b=$b 的和是${a + b}")
    }

    //求和2
    private fun sum2(a: Int, b: Int, c: String): Int? {
        if (c.toInt() is Int) {
            var res = a + b + c.toInt()
            tv_result.text = res.toString()
            return res
        }
        tv_result.text = "参数c不是int类型 求和失败"
        return null
    }

    //遍历集合
    private fun listLoop(fruits: List<String>) {
        var str = "test"
//        str.plus("6666")
        for (fruit in fruits) {
            str += fruit
        }
        println(str)
        tv_result.text = str
    }

    //单表达式函数搭配when使用 when表达式类似于java的switch
    private fun testWhen(a: Int): String =
        when (a) {
            1 -> "haha"
            2 -> "ha"
            3 -> "h"
            4 -> "hh"
            else -> "unknown"
        }

    //区间range
    private fun testRange(a: Int) {
       /* if (a in 1..10) {
            tv_result.text = "a在1到10 值为：$a"
        }

        if (a >= 11) {
            tv_result.text = "a大于等于11 值为：$a"
        }

        if (a in 12 until 15) {
            tv_result.text = "a大于等于12小于15 值为：$a"
        }*/

        when (a) {
            in 1..10  ->  tv_result.text = "a在1到10 值为：$a"
            in 11 until 12  ->  tv_result.text = "a大于等于11小于12 值为：$a"
            in 12 until 15  ->  tv_result.text = "a大于等于12小于15 值为：$a"
            else  ->  tv_result.text = "不在范围之内"
        }
    }

    //return标签
    private fun testReturn(){
        var str = ""
        //遍历集合
        listOf(1,2,3,4,5).forEach{
            if(it == 3){
                return //直接函数中返回
//                return@forEach //跳过3 继续循环相当于continue
            }
            str += it
            tv_result.text = str
        }
        tv_result.text = str + "this point is unreachable"
    }

    //数字区间上的迭代
    private fun testForeachRange(){
        var str = ""
        //倒叙打印间隔为2的数字 如10 8 6...
        for(i in 10 downTo 0 step 2){
            str += i
        }
        tv_result.text = str
    }

    //while循环
    private fun testWhile(a: Int){
        var a = a
        while (a > 0){
            a--
        }

        do {
            a++
        } while (a < 5)

        tv_result.text = "$a"
    }

    //null表达式
    private fun testNull(list: List<String>){
        val size = list.size
        tv_result.text = size.toString() ?: "empty"
    }

    //交换两个数字
    private fun switchNumber(a: Int,b: Int){
        var a = a
        var b = b
        a = b.also { b = a }
        tv_result.text = "a=$a 而 b=$b"
    }



    private class Person(var name: String ,var age: String ,var sex: String){
        init {

        }
    }


}
