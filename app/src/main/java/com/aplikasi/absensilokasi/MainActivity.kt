package com.aplikasi.absensilokasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        btnLoginListener()
        btnRegisterListener()
    }
    private fun btnLoginListener(){
        btn1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    private fun btnRegisterListener(){
        btn2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

}