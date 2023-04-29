//Nim   : 10120917
//Nama  : Ristian Aditya
//Kelas : IF10K
//TGL   : 26-4-2023

package com.example.lat2if10k10120917ristianaditya

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val bloodType = resources.getStringArray(R.array.type)
        val reshusType = resources.getStringArray(R.array.typeReshus)
        val jobType = resources.getStringArray(R.array.typeJob)

        val blood = findViewById<Spinner>(R.id.blood)
        val reshus = findViewById<Spinner>(R.id.reshus)
        val job = findViewById<Spinner>(R.id.job)

        if(blood != null){
            val adapter = ArrayAdapter(this, R.layout.spinner_item, bloodType)
            blood.adapter = adapter
        }

        if(reshus != null){
            val adapter = ArrayAdapter(this, R.layout.spinner_item, reshusType)
            reshus.adapter = adapter
        }

        if(job != null){
            val adapter = ArrayAdapter(this, R.layout.spinner_item, jobType)
            job.adapter = adapter
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.ic_header))

        val btnMoveActivity: Button = findViewById(R.id.buttonRegister)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.buttonRegister -> {
                val moveIntent = Intent(this@RegisterActivity, AlmostActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
