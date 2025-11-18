package com.example.sheriffcom

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.Cover).setOnClickListener {
            findViewById<View>(R.id.Cover).visibility = View.GONE
            findViewById<View>(R.id.Question).visibility = View.VISIBLE
        }


        findViewById<View>(R.id.Question).setOnClickListener {
            findViewById<View>(R.id.Question).visibility = View.GONE
            findViewById<View>(R.id.Answer).visibility = View.VISIBLE
        }

        findViewById<View>(R.id.Answer).setOnClickListener {
            findViewById<View>(R.id.Question2).visibility = View.VISIBLE
            findViewById<View>(R.id.Answer).visibility = View.GONE
        }
        findViewById<View>(R.id.Question2).setOnClickListener {
            findViewById<View>(R.id.Question2).visibility = View.GONE
            findViewById<View>(R.id.Answer2).visibility = View.VISIBLE
        }
        findViewById<View>(R.id.Answer2).setOnClickListener {
            findViewById<View>(R.id.Answer2).visibility = View.GONE
            findViewById<View>(R.id.Question).visibility = View.VISIBLE
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}