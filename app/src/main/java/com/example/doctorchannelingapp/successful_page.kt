package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class successful_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_successful_page)

        var btn_done1=findViewById<Button>(R.id.btn_done1)
        btn_done1.setOnClickListener {
            val intent = Intent(this, channel_doc2::class.java)
            startActivity(intent)
        }
    }
}