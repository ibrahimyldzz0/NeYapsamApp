package com.example.neyapsam

import java.io.Serializable

data class Yemek(
    val isim: String,
    val imageResId: Int,
    val malzemeler: String,
    val link: String
) : Serializable

