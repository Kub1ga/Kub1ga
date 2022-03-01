package com.example.githubuserapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    var nama: String,
    var namapengguna: String,
    var lokasi: String,
    var photo: Int,
    var repository: String,
    var company: String,
    var followers: String,
    var following: String
): Parcelable
