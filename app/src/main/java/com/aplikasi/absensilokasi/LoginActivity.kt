package com.aplikasi.absensilokasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()
        txtRegisterListener()
    }
    private fun btnBackLoginListener(){
        L_img_1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun txtRegisterListener(){
        txt_register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }



}