package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class app_intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_intro)

        var btn_next=findViewById<Button>(R.id.btn_next)
        btn_next.setOnClickListener {
            val intent = Intent(this, app_intro2::class.java)
            startActivity(intent)

        }

    }
}