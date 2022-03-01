package com.example.githubuserapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPerson: RecyclerView
    private val list = ArrayList<Person>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPerson = findViewById(R.id.rv_Person)
        rvPerson.setHasFixedSize(true)

        list.addAll(listPerson)
        showRecyclerList()

    }

    private val listPerson: ArrayList<Person>
        get() {
            val dataNama = resources.getStringArray(R.array.name)
            val dataNamapengguna = resources.getStringArray(R.array.username)
            val dataFollower = resources.getStringArray(R.array.followers)
            val dataFollowing = resources.getStringArray(R.array.following)
            val dataCompany = resources.getStringArray(R.array.company)
            val dataRepository = resources.getStringArray(R.array.repository)
            val dataLokasi = resources.getStringArray(R.array.location)
            val dataPhoto = resources.obtainTypedArray(R.array.avatar)
            val listPerson = ArrayList<Person>()
            for (i in dataNama.indices) {
                val person = Person(
                    dataNama[i],
                    dataNamapengguna[i],
                    dataLokasi[i],
                    dataPhoto.getResourceId(i, -1),
                    dataFollower[i],
                    dataFollowing[i],
                    dataCompany[i],
                    dataRepository[i]
                )
                listPerson.add(person)
            }
            return listPerson
        }

    private fun showRecyclerList() {
        rvPerson.layoutManager = LinearLayoutManager(this)
        val listPersonAdapter = ListPersonAdapter(list)
        rvPerson.adapter = listPersonAdapter
    }
}