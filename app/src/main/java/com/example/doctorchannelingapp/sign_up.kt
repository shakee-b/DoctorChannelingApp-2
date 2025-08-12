package com.example.doctorchannelingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var btn_signup2=findViewById<Button>(R.id.btn_signup2)
        btn_signup2.setOnClickListener {
            val intent = Intent(this, app_intro::class.java)
            startActivity(intent)

        }
    }
}