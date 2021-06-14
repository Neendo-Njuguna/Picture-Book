package com.example.mypicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnTwo = findViewById<Button>(R.id.btnTwo)
        btnTwo.setOnClickListener {
            val intent= Intent(baseContext,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}
