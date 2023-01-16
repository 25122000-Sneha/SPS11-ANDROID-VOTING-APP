package com.example.test_application1_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.example.test_application1_1.bckend.Validation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.tvName)
        val inputFieldtwo = findViewById<EditText>(R.id.tvDob)
        val buttonField = findViewById<Button>(R.id.button)
        val nextButton = findViewById<Button>(R.id.buttonnextPage)
        buttonField.setOnClickListener{
            val enteredAdhaar = inputField.text.toString()
            val enteredDob=inputFieldtwo.text.toString()
            val validation=Validation()
            val validation1=Validation()
            if(!validation.check_adhaar(enteredAdhaar)&&!validation1.check_dob(enteredDob)) {
                nextButton.visibility = INVISIBLE
                Toast.makeText(
                    this@MainActivity,
                    "Please Enter The above information",
                    LENGTH_SHORT
                ).show()
            }
            else {
                val message2 = "Your Aadhaar Number is $enteredAdhaar "

                greetingTextView.text = message2
                inputField.text.clear()
                inputFieldtwo.text.clear()
                nextButton.visibility=VISIBLE

            }
        }
        nextButton.setOnClickListener(){
            val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}