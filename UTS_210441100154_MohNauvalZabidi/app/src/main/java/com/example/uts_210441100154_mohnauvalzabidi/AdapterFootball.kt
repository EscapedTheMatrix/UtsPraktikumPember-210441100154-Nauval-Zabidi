package com.example.uts_210441100154_mohnauvalzabidi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFootball (private val listFootball: ArrayList<DataFootball>, private val context: Context
): RecyclerView.Adapter<AdapterFootball.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterFootball.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.grid_layout,
            parent, false
        )
        return CourseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AdapterFootball.CourseViewHolder, position: Int) {
        holder.nama.text = listFootball.get(position).Name
        holder.nim.text = listFootball.get(position).Nim
        holder.umur.text = listFootball.get(position).Age
        holder.gambar.setImageResource(listFootball.get(position).Img)
    }

    override fun getItemCount(): Int {
        return listFootball.size
    }

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.idgambar)
        val nama: TextView = itemView.findViewById(R.id.idnama)
        val nim: TextView = itemView.findViewById(R.id.idnim)
        val umur: TextView = itemView.findViewById(R.id.idumur)
    }
}