package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BusSchedulePage : AppCompatActivity() {

    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView
    private lateinit var imageView4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bus_schedule_page)

        imageView1 = findViewById(R.id.imageView15)
        imageView2 = findViewById(R.id.imageView11)
        imageView3 = findViewById(R.id.imageView17)
        imageView4 = findViewById(R.id.imageView18)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imageView1.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)

            finish()
        }

        imageView2.setOnClickListener{
            val intent = Intent(this, BusTrackPage::class.java)
            startActivity(intent)

            finish()
        }

        imageView3.setOnClickListener{
            val intent = Intent(this, BusSchedulePage::class.java)
            startActivity(intent)

            finish()
        }

        imageView4.setOnClickListener{
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)

            finish()
        }
    }
}