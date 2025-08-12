package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var btn_ch_doc_img=findViewById<Button>(R.id.btn_ch_doc_img)
        btn_ch_doc_img.setOnClickListener {
            val intent = Intent(this, channel_doc::class.java)
            startActivity(intent)

        }
        var btn_ch_doc=findViewById<Button>(R.id.btn_ch_doc)
        btn_ch_doc.setOnClickListener {
            val intent = Intent(this, channel_doc::class.java)
            startActivity(intent)

        }

        var btn_contactus=findViewById<Button>(R.id.btn_contactus)
        btn_contactus.setOnClickListener {
            val intent = Intent(this, contactus::class.java)
            startActivity(intent)

        }
        var btn_profile=findViewById<Button>(R.id.btn_profile)
        btn_profile.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)

        }
        var btn_t_and_c=findViewById<Button>(R.id.btn_t_and_c)
        btn_t_and_c.setOnClickListener {
            val intent = Intent(this, terms_and_condition::class.java)
            startActivity(intent)

        }

    }
}