package com.example.mywardrobe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WardrobeAdapter(
    private val items: List<WardrobeItem>,
    private val onItemClick: (WardrobeItem) -> Unit
) : RecyclerView.Adapter<WardrobeAdapter.WardrobeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WardrobeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wardrobe, parent, false)
        return WardrobeViewHolder(view)
    }

    override fun onBindViewHolder(holder: WardrobeViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { onItemClick(item) }
    }

    override fun getItemCount(): Int = items.size
    class WardrobeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)

        fun bind(item: WardrobeItem) {
            imageView.setImageResource(item.imageResId)
            nameTextView.text = item.name
        }
    }
}