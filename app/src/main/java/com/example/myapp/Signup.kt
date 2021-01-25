package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.muddzdev.styleabletoast.StyleableToast

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_signup)

        //making variable or binding them

        val l_text = findViewById<TextView>(R.id.Login_text)
        val username = findViewById<EditText>(R.id.Signup_username)
        val password = findViewById<EditText>(R.id.Signup_password)
        val confirm_password = findViewById<EditText>(R.id.Signup_c_password)
        val Button = findViewById<Button>(R.id.Signup_btn)

        //when the signup button is pressed
        Button.setOnClickListener{

            val Str_user = username.text.toString()
            val Str_password = password.text.toString()
            val Str_c_password = confirm_password.text.toString()

            // to check the values
            if (Str_user.isEmpty() || Str_password.isEmpty() || Str_c_password.isEmpty()) {
                val toast = StyleableToast.makeText(applicationContext , "Plz Enter The Value" , R.style.mytoast)
                toast.show()
            }

            else {
                val toast = StyleableToast.makeText(applicationContext , "Sucess" , R.style.mytoast)
                toast.show()
            }

        }

        //when login text is clicked
        l_text.setOnClickListener{
            startActivity(Intent(this,Second::class.java))
        }
    }

    override fun onBackPressed() {
        //it will do nothing back button is disable
    }
}

