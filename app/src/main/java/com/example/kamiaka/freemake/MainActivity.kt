package com.example.kamiaka.freemake

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var countNumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var countText = findViewById(R.id.countText) as TextView
        val PlusButton = findViewById(R.id.plusbutton) as Button
        val MinusButton = findViewById(R.id.minusbutton) as Button

        PlusButton.setOnClickListener {
                countNumber++
                countText.setText(Integer.toString(countNumber))

            MinusButton.setOnClickListener {
                countNumber--
                countText.setText(Integer.toString(countNumber))
                }
            }
        }
}

