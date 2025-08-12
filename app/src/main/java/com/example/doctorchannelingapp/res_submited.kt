package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class res_submited : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res_submited)

        var btn_ok3=findViewById<Button>(R.id.btn_ok3)
        btn_ok3.setOnClickListener {
            val intent = Intent(this, channel_doc2::class.java)
            startActivity(intent)
        }
    }
}