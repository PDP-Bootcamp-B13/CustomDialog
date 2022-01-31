package me.ruyeo.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "dsa", Toast.LENGTH_SHORT).show()

        setupUI()
    }

    private fun setupUI() {

        Toast.makeText(this, "OgabekDev", Toast.LENGTH_SHORT).show()
    }
}