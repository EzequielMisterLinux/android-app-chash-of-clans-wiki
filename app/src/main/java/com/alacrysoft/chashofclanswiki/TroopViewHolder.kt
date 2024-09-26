package com.alacrysoft.chashofclanswiki


import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TroopViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val troopImage: ImageView = view.findViewById(R.id.imageTroop)
    private val troopName: TextView = view.findViewById(R.id.nameTroop)
    private val troopType: TextView = view.findViewById(R.id.typeTroop)
    private val troopDescription: TextView = view.findViewById(R.id.descriptionTroop)

    fun render(troopModel: Troop) {
        troopImage.setImageResource(troopModel.imageResourceId)
        troopName.text = troopModel.name
        troopType.text = troopModel.type
        troopDescription.text = troopModel.description

        itemView.setOnClickListener {
            val context = itemView.context
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("name", troopModel.name)
                putExtra("type", troopModel.type)
                putExtra("description", troopModel.description)
                putExtra("imageResourceId", troopModel.imageResourceId)
            }
            context.startActivity(intent)
        }
    }
}