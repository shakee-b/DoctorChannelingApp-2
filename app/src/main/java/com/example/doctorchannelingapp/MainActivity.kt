package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_sign_in=findViewById<Button>(R.id.btn_sign_in)
        btn_sign_in.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }

            var btn_signup=findViewById<Button>(R.id.btn_signup)
            btn_signup.setOnClickListener {
                val intent = Intent(this, sign_up::class.java)
                startActivity(intent)

        }

    }
}