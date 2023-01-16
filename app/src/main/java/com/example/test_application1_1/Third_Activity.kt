package com.example.test_application1_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Third_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val button2_submit = findViewById<Button>(R.id.button2_submit)
        button2_submit.setOnClickListener() {
            val intent = Intent(this, Fourth_Activity::class.java)
            startActivity(intent)
        }
    }
}