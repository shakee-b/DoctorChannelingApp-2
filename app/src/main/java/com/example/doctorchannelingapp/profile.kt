package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var btn_update=findViewById<Button>(R.id.btn_update)
        btn_update.setOnClickListener {
            val intent = Intent(this, update_profile::class.java)
            startActivity(intent)
        }
        var btn_back4=findViewById<Button>(R.id.btn_back4)
        btn_back4.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }
    }
}