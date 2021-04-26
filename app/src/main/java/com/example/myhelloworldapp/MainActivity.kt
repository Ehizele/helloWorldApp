package com.example.myhelloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var subtract = findViewById<Button>(R.id.decrement)
        var text =  findViewById<TextView>(R.id.textView)
        var add = findViewById<Button>(R.id.increment)

        subtract.setOnClickListener {
            count--
            text.setText("$count")
        }
        add.setOnClickListener{
            count++
            text.setText("$count")
        }
    }


}