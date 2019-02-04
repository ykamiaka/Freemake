package com.example.kamiaka.freemake

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.format.DateFormat
import android.widget.*

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.lang.String.format
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.timer


     class MainActivity : AppCompatActivity() {

         override fun onCreate(savedInstanceState: Bundle?) {
             super.onCreate(savedInstanceState)
             setContentView(R.layout.activity_main)

             val handler = Handler()
             timer(name = "testTimer", period = 1000) {
                 val calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN)
                 val hour = calendar.get(Calendar.HOUR_OF_DAY)
                 val minute = calendar.get(Calendar.MINUTE)
                 val second = calendar.get(Calendar.SECOND)
                 handler.post {
                     val test = findViewById<TextView>(R.id.dateView)
                     test.text = "${hour}:${minute}:${second}"
                 }
             }
             // countNumberの初期値の宣言
             var CountNumber = 0
             //Buttonからid.plusbuttonを検索
             val PlusButton = findViewById(R.id.plusbutton) as Button
             //Buttonからid.minusbuttonを検索
             val MinusButton = findViewById(R.id.minusbutton) as Button
             // val addButton = findViewById(R.id.addbutton) as Button
             // val ClearButton = findViewById(R.id.clearbutton) as Button
             // val sumButton = findViewById(R.id.sumbutton) as Button


             //var CommentText = findViewById(R.id.commenttext) as EditText
             // var MyListView = findViewById(R.id.mylistview) as ListView


             //PlusButtonにcountNumberに1加算する機能の追加
             PlusButton.setOnClickListener {
                 CountNumber++
                 //countNumberの最大値を9999に指定
                 if (CountNumber >= 9999) {
                     CountNumber = 9999
                 }

                 counttext.setText(Integer.toString(CountNumber))
                 //MinusButtonにcountNumberから1減算する機能の追加
                 MinusButton.setOnClickListener {
                     CountNumber--
                     //countNumberの最小値を0に指定
                     if (CountNumber <= 0) {
                         CountNumber = 0
                     }
                     counttext.setText(Integer.toString(CountNumber))

                 }
             }
         }
     }




















