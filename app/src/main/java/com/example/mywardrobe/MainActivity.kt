package com.example.mywardrobe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mywardrobe.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToWardrobe = findViewById<Button>(R.id.btnToWardrobe)
        btnToWardrobe.setOnClickListener {
            // Переход на экран списка
            val intent = Intent(this, WardrobeActivity::class.java)
            startActivity(intent)
        }
    }
}