package com.example.githubuserapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListPersonAdapter(private val listPerson: ArrayList<Person>): RecyclerView.Adapter<ListPersonAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_personname)
        var tvNamapengguna: TextView = itemView.findViewById(R.id.tv_username)
        var tvLokasi: TextView = itemView.findViewById(R.id.tv_location)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_avatar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_person, parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (nama, namapengguna, lokasi, photo) = listPerson[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvNama.text = nama
        holder.tvNamapengguna.text = namapengguna
        holder.tvLokasi.text = lokasi

    }

    override fun getItemCount(): Int {
        return listPerson.size
    }
}