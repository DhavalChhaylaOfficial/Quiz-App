package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val button:Button = findViewById(R.id.button)
        val input : EditText = findViewById(R.id.input)

        button.setOnClickListener{
            if(input.text.toString().isEmpty())
            {
                Toast.makeText(this, "Enter Your Name", Toast.LENGTH_SHORT).show()
            }
            else{
                var intent = Intent(this, Question::class.java)
                intent.putExtra("${setData.name}", input.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}