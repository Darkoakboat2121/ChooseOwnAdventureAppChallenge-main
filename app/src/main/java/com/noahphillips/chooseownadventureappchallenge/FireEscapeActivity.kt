package com.noahphillips.chooseownadventureappchallenge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FireEscapeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fire_escape)
        val option1: Button = findViewById(R.id.option1)
        option1.setOnClickListener {
            val intent = Intent(this, YoinkEnding::class.java)
            this.startActivity(intent)
            finish()
        }

        val option2: Button = findViewById(R.id.option2)
        option2.setOnClickListener {
            val intent = Intent(this, MysteryEnding::class.java)
            this.startActivity(intent)
            finish()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}