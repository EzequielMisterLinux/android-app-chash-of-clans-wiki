package com.alacrysoft.chashofclanswiki

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name")
        val type = intent.getStringExtra("type")
        val description = intent.getStringExtra("description")
        val imageResourceId = intent.getIntExtra("imageResourceId", 0)

        findViewById<ImageView>(R.id.detailImageTroop).setImageResource(imageResourceId)
        findViewById<TextView>(R.id.detailNameTroop).text = name
        findViewById<TextView>(R.id.detailTypeTroop).text = type
        findViewById<TextView>(R.id.detailDescriptionTroop).text = description

        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
    }
}