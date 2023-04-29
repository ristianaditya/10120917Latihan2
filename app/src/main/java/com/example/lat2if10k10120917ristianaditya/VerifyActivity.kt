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

class VerifyActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        supportActionBar?.hide();

        val btnMoveHome: Button = findViewById(R.id.buttonSend)
        btnMoveHome.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.buttonSend -> {
                val moveIntent = Intent(this@VerifyActivity, HomeActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}