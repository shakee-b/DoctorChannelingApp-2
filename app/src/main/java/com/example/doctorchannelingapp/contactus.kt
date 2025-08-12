package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class contactus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactus)

        var btn_back5=findViewById<Button>(R.id.btn_back5)
        btn_back5.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }
        var btn_submit=findViewById<Button>(R.id.btn_submit)
        btn_submit.setOnClickListener {
            val intent = Intent(this, res_submited_c::class.java)
            startActivity(intent)
        }
    }
}