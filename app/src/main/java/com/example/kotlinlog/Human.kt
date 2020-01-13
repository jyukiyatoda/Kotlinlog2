package com.example.kotlinlog

import  android.util.Log

abstract class Human:Animal,Thinkable {


    //コンストラクタ親クラスの呼び出し
    constructor(name:String,age:Int,hobby:String):super(name,age,hobby){



    }
    //Animalクラスのメソッドオーバーライド
    override fun say(){
        Log.d("kotlintest","私の名前は"+this.name+"です。"+"年は"+this.age+"歳です。")
    }
    //Thinkableインターフェースのメソッドをオーバーライド
    override fun think(){
        Log.d("kotlintest","私は"+this.hobby+"について考える。")
    }

}