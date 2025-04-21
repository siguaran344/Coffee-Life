package com.example.coffelife

import android.annotation.SuppressLint
import android.os.Bundle
import com.example.coffelife.ui.theme.Coffee

android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val coffeeList = listOf(
            Coffee("Colombian Brew", "Rich and full-bodied.", 4.5f, R.drawable.capuchino),
            Coffee("Italian Espresso", "Intense and aromatic.", 5.0f, R.drawable.latte),
            Coffee("Classic Latte", "Smooth and creamy.", 4.8f, R.drawable.espresso),
            Coffee("Iced Coffee", "Chilled and refreshing.", 4.2f, R.drawable.macchiato)
        )

        val adapter = CoffeeAdapter(coffeeList)
        recyclerView.adapter = adapter
    }
}