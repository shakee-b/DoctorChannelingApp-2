package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        var btn_done2=findViewById<Button>(R.id.btn_done2)
        btn_done2.setOnClickListener {
            val intent = Intent(this, res_submited::class.java)
            startActivity(intent)
        }
    }
}