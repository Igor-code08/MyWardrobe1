package com.example.mywardrobe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mywardrobe.R as R


class WardrobeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wardrobe)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val wardrobeItems = listOf(
            WardrobeItem(R.drawable.ic_launcher_background, "Рубашка", "Белая рубашка из хлопка"),
            WardrobeItem(R.drawable.ic_launcher_background, "Брюки", "Классические черные брюки"),

        )

        val adapter = WardrobeAdapter(wardrobeItems) { item ->
            // Обработчик клика по элементу списка
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("item", item)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}