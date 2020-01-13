package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1つ目のhumanインスタンスの作成
        val human=Human("tosizou",40,"野球")

        human.say()
        human.think()

        //2つ目のhumanインスタンスの作成
        val human2=Human("tosiko",80,"サッカー")

        human2.say()
        human2.think()
    }
}
