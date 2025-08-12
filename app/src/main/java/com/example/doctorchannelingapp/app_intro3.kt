package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class app_intro3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_intro3)

        var btn_next3=findViewById<Button>(R.id.btn_next3)
        btn_next3.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)

        }

    }
}