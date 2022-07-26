package com.example.nfc_scanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent)

        //Cofnięcie do głównego menu
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Wypożyczanie stroju"
    }
}