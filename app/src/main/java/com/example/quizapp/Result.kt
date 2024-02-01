package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName = intent.getStringExtra(setData.name)
        val score = intent.getStringExtra(setData.score)
        val totalQuestions = intent.getStringExtra("total size")

        val congo : TextView = findViewById(R.id.congo)
        val Score:TextView = findViewById(R.id.Score)
        val button:TextView = findViewById(R.id.button)

        congo.text = "Congratulations ${userName} !! \uD83C\uDF89"
        Score.text= "${score} / ${totalQuestions}"

        button.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}