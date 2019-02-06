package com.example.kamiaka.freemake

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.annotation.IntegerRes
import android.text.format.DateFormat
import android.view.View
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
                val time = findViewById<TextView>(R.id.dateView)
                time.text = "${hour}:${minute}:${second}"
            }
        }

        // countNumberの初期値の宣言
       // var c = 0
        var c = 0

      //  fun onAddButton(v : View) {
        //    testtext.text = "$c"
       // }
        //counttext.setText(String.format("%,d", 1000))

        //Buttonからid.plusbuttonを検索
        val PlusButton = findViewById(R.id.plusbutton) as Button
        //Buttonからid.minusbuttonを検索
        val MinusButton = findViewById(R.id.minusbutton) as Button
        // val addButton = findViewById(R.id.addbutton) as Button
        // val ClearButton = findViewById(R.id.clearbutton) as Button
        // val sumButton = findViewById(R.id.sumbutton) as Button



        // var MyListView = findViewById(R.id.mylistview) as ListView


        //PlusButtonにcountNumberに1加算する機能の追加
        PlusButton.setOnClickListener {
            c++
            //countNumberの最大値を9999に指定
            if (c >= 9999) {
                c = 9999
            }
            //   CountNumber = (Int.("%,d"))

            counttext.setText(Integer.toString(c))
            //MinusButtonにcountNumberから1減算する機能の追加
            MinusButton.setOnClickListener {
                c--
                //countNumberの最小値を0に指定
                if (c <= 0) {
                    c = 0
                }
                counttext.setText(Integer.toString(c))
            }
        }

        val AddButton = findViewById(R.id.addbutton) as Button
        var e = findViewById(R.id.commenttext) as EditText

     // data class stock(val time: String, val count: String, val Comment: String)


        //  val s = stock("$time", "$c", "$e")
        //var Timer = dateView
        AddButton.setOnClickListener {

           // testtext.text = "$s"
            testtext.text = "$c"
            //testtext.text = "$c,$e"

         //   testtext.setText(Integer.toString(Timer))

        }
    }
}


        //
        //
       // var CommentText = findViewById(R.id.commenttext) as EditText
        //val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)


        //arrayAdapter.add("${CommentText}")
        //arrayAdapter.add("iOS")
        //arrayAdapter.add("Windows")
        //arrayAdapter.add("macOS")
        //arrayAdapter.add("Unix")


        //val listView: ListView = findViewById(R.id.mylistview)
        //listView.adapter = arrayAdapter

        //
        //

       // val CountText = findViewById(R.id.counttext) as TextView
       // val DataArray = arrayOf(dateView,CountText,CommentText)
        //val Adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DataArray)
        //mylistview.adapter = Adapter

        //////ClearButton.setOnClickListener {
        //////Adapter.remove("${MyListView}")
        //////Adapter.notifyDataSetChanged()
//////
        // }


























