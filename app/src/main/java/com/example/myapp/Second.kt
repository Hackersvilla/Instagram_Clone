package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.muddzdev.styleabletoast.StyleableToast


class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_second)

        val S_text  = findViewById<TextView>(R.id.signup_btn)
        val S_btn = findViewById<Button>(R.id.SignIn_btn)

        S_text.setOnClickListener {
            startActivity(Intent(this , Signup::class.java))
        }

        S_btn.setOnClickListener {
            val toast = StyleableToast.makeText(applicationContext , "Submit" , R.style.mytoast)
            toast.show()
        }
    }

    override fun onBackPressed() {
    }
}