package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class doctor1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor1)

        var btn_booknow1=findViewById<Button>(R.id.btn_booknow1)
        btn_booknow1.setOnClickListener {
            val intent = Intent(this, doc1_channel::class.java)
            startActivity(intent)

        }
        var btn_feedback=findViewById<Button>(R.id.btn_feedback)
        btn_feedback.setOnClickListener {
            val intent = Intent(this, review::class.java)
            startActivity(intent)
        }
        var btn_contact1=findViewById<Button>(R.id.btn_contact1)
        btn_contact1.setOnClickListener {
            val intent = Intent(this, call1::class.java)
            startActivity(intent)
        }
        var btn_back3=findViewById<Button>(R.id.btn_back3)
        btn_back3.setOnClickListener {
            val intent = Intent(this, channel_doc2::class.java)
            startActivity(intent)
        }
    }
}