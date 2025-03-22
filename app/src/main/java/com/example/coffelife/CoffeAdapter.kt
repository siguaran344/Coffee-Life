package com.example.coffelife

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffelife.ui.theme.Coffee

class CoffeeAdapter(private val coffeeList: List<Coffee>) :
    RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    inner class CoffeeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val coffeeImage: ImageView = view.findViewById(R.id.coffeeImage)
        val coffeeName: TextView = view.findViewById(R.id.coffeeName)
        val coffeeDescription: TextView = view.findViewById(R.id.coffeeDescription)
        val coffeeRating: RatingBar = view.findViewById(R.id.coffeeRating)
        val buyButton: Button = view.findViewById(R.id.buyButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_coffee, parent, false)
        return CoffeeViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        val coffee = coffeeList[position]
        holder.coffeeImage.setImageResource(coffee.imageResId)
        holder.coffeeName.text = coffee.name
        holder.coffeeDescription.text = coffee.description
        holder.coffeeRating.rating = coffee.rating

        holder.buyButton.setOnClickListener {
            // Lógica de compra
        }
    }

    override fun getItemCount() = coffeeList.size
}