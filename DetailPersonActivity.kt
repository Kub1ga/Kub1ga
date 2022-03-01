package com.example.githubuserapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailPersonActivity : AppCompatActivity() {
    companion object {
        var EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_person)

        val detailPhoto: ImageView = findViewById(R.id.detail_avatar)
        val detailNama: TextView = findViewById(R.id.detail_name)
        val detailNamapengguna: TextView = findViewById(R.id.tv_username)
        val detailFollower: TextView = findViewById(R.id.detail_followers)
        val detailFollowing: TextView = findViewById(R.id.detail_following)
        val detailRepository: TextView = findViewById(R.id.detail_respostiry)
        val detailCompany: TextView = findViewById(R.id.detail_company)
        val detailLocation: TextView = findViewById(R.id.detail_location)

        val listPerson = intent.getParcelableExtra<Person>(EXTRA_DATA) as Person

        detailPhoto.setImageResource(listPerson.photo)
        detailNama.text = listPerson.nama
        detailNamapengguna.text = listPerson.namapengguna
        detailFollower.text = listPerson.followers
        detailFollowing.text = listPerson.following
        detailRepository.text = listPerson.repository
        detailCompany.text = listPerson.company
        detailLocation.text = listPerson.lokasi
    }
}