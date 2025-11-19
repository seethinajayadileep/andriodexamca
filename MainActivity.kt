package com.example.exam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       var btn1=findViewById<Button>(R.id.login1);
        btn1.setOnClickListener {
            Toast.makeText(this, "Login is Successful", Toast.LENGTH_SHORT).show()
        }
    }
}