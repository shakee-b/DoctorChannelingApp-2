package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class channel_doc2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_channel_doc2)

        var btn_back2=findViewById<Button>(R.id.btn_back2)
        btn_back2.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }
        var btn_gen_practice=findViewById<Button>(R.id.btn_gen_practice)
        btn_gen_practice.setOnClickListener {
            val intent = Intent(this, doctor1::class.java)
            startActivity(intent)
        }
    }
}