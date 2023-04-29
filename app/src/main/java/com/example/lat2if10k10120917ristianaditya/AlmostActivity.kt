//Nim   : 10120917
//Nama  : Ristian Aditya
//Kelas : IF10K
//TGL   : 29-4-2023

package com.example.lat2if10k10120917ristianaditya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AlmostActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)
        supportActionBar?.hide();

        val btnMoveVerify: Button = findViewById(R.id.buttonVerify)
        btnMoveVerify.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.buttonVerify -> {
                val moveIntent = Intent(this@AlmostActivity, VerifyActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}