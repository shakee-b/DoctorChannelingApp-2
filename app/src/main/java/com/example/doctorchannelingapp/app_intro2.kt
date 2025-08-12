package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class app_intro2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_intro2)

        var btn_next2=findViewById<Button>(R.id.btn_next2)
        btn_next2.setOnClickListener {
            val intent = Intent(this, app_intro3::class.java)
            startActivity(intent)

        }

    }
}