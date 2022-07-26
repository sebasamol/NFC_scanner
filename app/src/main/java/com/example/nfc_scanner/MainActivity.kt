package com.example.nfc_scanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Przejście do okna z wypożyczeniem stroju
        val buttonClickListener = findViewById<Button>(R.id.rent_button)
        buttonClickListener.setOnClickListener {
            val intent = Intent(this, RentActivity::class.java)
            startActivity(intent)
        }
    }
}