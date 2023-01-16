package com.example.test_application1_1

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import java.util.jar.Manifest

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val button2_next = findViewById<Button>(R.id.button2_next)
        button2_next.setOnClickListener() {
            val intent = Intent(this, Third_Activity::class.java)
            startActivity(intent)
        }
    }
}