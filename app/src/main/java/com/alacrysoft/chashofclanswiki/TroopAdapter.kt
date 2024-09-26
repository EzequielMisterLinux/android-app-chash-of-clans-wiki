package com.alacrysoft.chashofclanswiki

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TroopAdapter(private val troopList: List<Troop>) : RecyclerView.Adapter<TroopViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TroopViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TroopViewHolder(layoutInflater.inflate(R.layout.item_troop, parent, false))
    }

    override fun getItemCount(): Int = troopList.size

    override fun onBindViewHolder(holder: TroopViewHolder, position: Int) {
        val item = troopList[position]
        holder.render(item)
    }
}