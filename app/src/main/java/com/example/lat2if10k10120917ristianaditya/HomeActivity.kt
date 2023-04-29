//Nim   : 10120917
//Nama  : Ristian Aditya
//Kelas : IF10K
//TGL   : 26-4-2023

package com.example.lat2if10k10120917ristianaditya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide();
    }
}