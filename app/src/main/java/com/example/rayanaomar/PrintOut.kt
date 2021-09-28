package com.example.rayanaomar


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class PrintOut : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val tvMain = findViewById<TextView>(R.id.print)
        val pri = intent.extras?.get("Text")

        tvMain.text = pri.toString()
    }
}