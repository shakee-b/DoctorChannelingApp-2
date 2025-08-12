package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class channel_doc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_channel_doc)

        var channelnow=findViewById<Button>(R.id.channelnow)
        channelnow.setOnClickListener {
            val intent = Intent(this, channel_doc2::class.java)
            startActivity(intent)

        }

        var btn_back=findViewById<Button>(R.id.btn_back)
        btn_back.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)

        }

    }
}