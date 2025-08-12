package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class doc1_channel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doc1_channel)

        var btn_ok1=findViewById<Button>(R.id.btn_ok1)
        btn_ok1.setOnClickListener {
            val intent = Intent(this, successful_page::class.java)
            startActivity(intent)

        }
    }
}