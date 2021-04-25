package com.example.helloworldd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       var textDisplay = findViewById<TextView>(R.id.textview_increment)
        var plusButton = findViewById<Button>(R.id.button_increment)

        var increment_number = 0

        plusButton.setOnClickListener(){
        increment_number++

             textDisplay.setText(increment_number.toString())


    }


    }
}