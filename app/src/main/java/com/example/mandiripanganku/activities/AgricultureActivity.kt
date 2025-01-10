package com.example.mandiripanganku.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mandiripanganku.R

class AgricultureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_agriculture)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.agriculture)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val topBarTitle = findViewById<TextView>(R.id.top_bar_title)
        topBarTitle.text = getString(R.string.agriculture_title)

        findViewById<ImageView>(R.id.back).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.ic_profile).setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.ic_home).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.ic_report).setOnClickListener {
            val intent = Intent(this, ReportActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.ic_community).setOnClickListener {
            val intent = Intent(this, CommunityActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.my_food).setOnClickListener {
            val intent = Intent(this, AgrilistActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.my_clue).setOnClickListener {
            val intent = Intent(this, ClueAgricultureActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.my_report).setOnClickListener {
            val intent = Intent(this, ReportActivity::class.java)
            startActivity(intent)
        }

        onBackPressedDispatcher.addCallback(
            this, object : OnBackPressedCallback(true){
                override fun handleOnBackPressed() {
                    val intent = Intent(this@AgricultureActivity, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        )



    }

}