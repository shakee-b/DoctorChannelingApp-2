package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class call1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call1)

        var btn_call_deceline1=findViewById<Button>(R.id.btn_call_deceline1)
        btn_call_deceline1.setOnClickListener {
            val intent = Intent(this, doctor1::class.java)
            startActivity(intent)
        }
    }
}